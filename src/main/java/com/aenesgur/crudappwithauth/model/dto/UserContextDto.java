package com.aenesgur.crudappwithauth.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class UserContextDto {
    private String username;
    private String password;
    private  String email;
}
