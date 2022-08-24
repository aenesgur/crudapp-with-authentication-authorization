package com.aenesgur.crudappwithauth.service;

import com.aenesgur.crudappwithauth.model.dto.UserContextDto;
import com.aenesgur.crudappwithauth.model.entity.user.UserContext;

public interface UserService {
    void register(UserContextDto userContext);
    UserContext load(String email);
}
