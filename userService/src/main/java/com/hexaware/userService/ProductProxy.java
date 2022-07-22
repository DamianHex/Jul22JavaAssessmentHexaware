package com.hexaware.userService;


import com.hexaware.productService.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8080")
public interface ProductProxy {
    @GetMapping("/products")
    public List<Product> listAllProducts();

    @GetMapping("/products/{id}")
    public Product listProductById(@PathVariable long id);
}
