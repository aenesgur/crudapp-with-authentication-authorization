package com.aenesgur.crudappwithauth.repository;

import com.aenesgur.crudappwithauth.model.entity.user.UserContext;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserContext, Long> {
    public Optional<UserContext> findByEmail(String email);
}
