package com.aenesgur.crudappwithauth.repository;

import com.aenesgur.crudappwithauth.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
