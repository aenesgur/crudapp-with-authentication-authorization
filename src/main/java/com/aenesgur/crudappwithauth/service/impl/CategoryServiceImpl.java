package com.aenesgur.crudappwithauth.service.impl;

import com.aenesgur.crudappwithauth.model.entity.Category;
import com.aenesgur.crudappwithauth.repository.CategoryRepository;
import com.aenesgur.crudappwithauth.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}
