package org.elguazzar.productservice.services;

import org.elguazzar.productservice.entities.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    void deleteProduct(String id);
    Product updateProduct(String id,Product product);
    List<Product> getAllProducts();
    Product getProductById(String id);
}
