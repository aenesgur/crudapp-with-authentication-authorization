package com.aenesgur.crudappwithauth.controller.user;

import com.aenesgur.crudappwithauth.model.dto.UserContextDto;
import com.aenesgur.crudappwithauth.model.entity.user.UserContext;
import com.aenesgur.crudappwithauth.security.annotation.IdGuard;
import com.aenesgur.crudappwithauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Integer> register(@RequestBody UserContextDto userContextDto) {
        userService.register(userContextDto);
        return ResponseEntity.ok().body(HttpStatus.CREATED.value());
    }

    @IdGuard(parameterIndex = 0)
    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity<Integer> load(@PathVariable("userId") Integer userId) {

        //return ResponseEntity.ok().body(userService.load(userId));
        return ResponseEntity.ok().body(HttpStatus.OK.value());
    }
}
