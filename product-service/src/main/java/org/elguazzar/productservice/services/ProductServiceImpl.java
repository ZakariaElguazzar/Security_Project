package org.elguazzar.productservice.services;

import lombok.AllArgsConstructor;
import org.elguazzar.productservice.Repositories.ProductRepo;
import org.elguazzar.productservice.entities.Product;
import org.elguazzar.productservice.exceptions.ProductNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public Product addProduct(Product product) {
        // Possible validations
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        if (product.getStockQuantity() < 0) {
            throw new IllegalArgumentException("Product quantity cannot be negative");
        }
        return productRepo.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        if (!productRepo.existsById(id)) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }
        productRepo.deleteById(id);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        Product existingProduct = productRepo.findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException(
                                "Product with id " + product.getProductId() + " not found"
                        )
                );

        // Update only allowed fields
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStockQuantity(product.getStockQuantity());

        return productRepo.save(existingProduct);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepo.findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException("Product with id " + id + " not found")
                );
    }
}
