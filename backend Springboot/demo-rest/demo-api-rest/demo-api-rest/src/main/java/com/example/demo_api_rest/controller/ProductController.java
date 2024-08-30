package com.example.demo_api_rest.controller;


import com.example.demo_api_rest.entity.Product;
import com.example.demo_api_rest.servicio.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private  ProductService productService;

    @GetMapping
    public ResponseEntity getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }
    @GetMapping("/{id}")
    public  Product getProductById(@PathVariable Long id) {
        return productService.findById(id);


    }


}

