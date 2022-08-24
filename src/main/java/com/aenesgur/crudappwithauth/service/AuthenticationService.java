package com.aenesgur.crudappwithauth.service;

import com.aenesgur.crudappwithauth.model.dto.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse authenticate(String authorization);
}
