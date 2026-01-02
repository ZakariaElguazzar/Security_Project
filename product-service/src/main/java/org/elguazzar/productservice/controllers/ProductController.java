package org.elguazzar.productservice.controllers;


import lombok.AllArgsConstructor;
import org.elguazzar.productservice.entities.Product;
import org.elguazzar.productservice.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.addProduct(product));
    }

    // Mettre à jour un produit (ADMIN)
    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable String id,
            @RequestBody Product product
    ){
        return ResponseEntity.ok(productService.updateProduct(id,product));
    }

    // Supprimer un produit (ADMIN)
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product with id " + id + " deleted successfully");
    }

    // Lister tous les produits (ADMIN, CLIENT)
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    // Consulter un produit par id (ADMIN, CLIENT)
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
