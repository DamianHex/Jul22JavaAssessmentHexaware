package com.hexaware.userService;

import com.hexaware.productService.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    ProductProxy productProxy;

    @GetMapping("/products")
    public List<Product> listAllProducts() {
        return productProxy.listAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product listProductById(@PathVariable long id) {
        return productProxy.listProductById(id);
    }


}
