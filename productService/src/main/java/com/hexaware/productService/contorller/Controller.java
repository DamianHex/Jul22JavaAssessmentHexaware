package com.hexaware.productService.contorller;

import com.hexaware.productService.model.Product;
import com.hexaware.productService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> listAllProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Optional<Product> listProductById(@PathVariable Long id){
        return productRepository.findById(id);
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
