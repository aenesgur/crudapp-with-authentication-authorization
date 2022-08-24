package com.aenesgur.crudappwithauth.controller;

import com.aenesgur.crudappwithauth.model.entity.Category;
import com.aenesgur.crudappwithauth.model.entity.Product;
import com.aenesgur.crudappwithauth.repository.CategoryRepository;
import com.aenesgur.crudappwithauth.repository.ProductRepository;
import com.aenesgur.crudappwithauth.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Integer> saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return ResponseEntity.ok().body(HttpStatus.CREATED.value());
    }
}
