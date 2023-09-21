package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.entity.Product;
import com.luv2code.ecommerce.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductTestController {

    @Autowired
    public ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> returnProducts(){
        return productRepository.findAll();
    }
    @GetMapping("/")
    public String returnString(){
        return "Ping";
    }

}
