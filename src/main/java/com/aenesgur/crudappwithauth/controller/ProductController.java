package com.aenesgur.crudappwithauth.controller;

import com.aenesgur.crudappwithauth.model.entity.Product;
import com.aenesgur.crudappwithauth.repository.ProductRepository;
import com.aenesgur.crudappwithauth.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Integer> saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return ResponseEntity.ok().body(HttpStatus.CREATED.value());
    }
}
