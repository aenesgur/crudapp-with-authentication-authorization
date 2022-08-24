package com.aenesgur.crudappwithauth.repository;

import com.aenesgur.crudappwithauth.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
