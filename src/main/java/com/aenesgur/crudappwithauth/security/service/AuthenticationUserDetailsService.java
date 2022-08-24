package com.aenesgur.crudappwithauth.security.service;

import com.aenesgur.crudappwithauth.model.entity.user.UserContext;
import com.aenesgur.crudappwithauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserContext userContext = userService.load(email);
        if(userContext == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        return User.withUsername(userContext.getEmail())
                .password(userContext.getPassword())
                .authorities(userContext.getRole().toString())
                .build();
    }
}
