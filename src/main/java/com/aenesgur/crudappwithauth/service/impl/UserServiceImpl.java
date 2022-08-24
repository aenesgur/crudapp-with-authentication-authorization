package com.aenesgur.crudappwithauth.service.impl;

import com.aenesgur.crudappwithauth.model.dto.UserContextDto;
import com.aenesgur.crudappwithauth.model.entity.user.UserContext;
import com.aenesgur.crudappwithauth.model.entity.user.enums.Role;
import com.aenesgur.crudappwithauth.repository.UserRepository;
import com.aenesgur.crudappwithauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(UserContextDto userContextDto) {
        UserContext userContext = toEntity(userContextDto);
        userRepository.save(userContext);
    }

    public UserContext load(String email){
        return userRepository.findByEmail(email).orElse(null);
    }

    private UserContext toEntity(UserContextDto userContextDto){
        UserContext userContext = new UserContext();
        userContext.setEmail(userContextDto.getEmail());
        userContext.setPassword(userContextDto.getPassword());
        userContext.setUsername(userContextDto.getUsername());
        userContext.setRole(Role.USER);
        return userContext;
    }

}
