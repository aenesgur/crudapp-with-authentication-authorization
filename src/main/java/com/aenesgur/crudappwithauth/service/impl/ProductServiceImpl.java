package com.aenesgur.crudappwithauth.service.impl;

import com.aenesgur.crudappwithauth.model.entity.Product;
import com.aenesgur.crudappwithauth.repository.ProductRepository;
import com.aenesgur.crudappwithauth.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
}
