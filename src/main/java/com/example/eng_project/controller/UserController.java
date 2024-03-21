package com.example.eng_project.controller;

import com.example.eng_project.controller.dto.UserDto;
import com.example.eng_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void Create(@RequestBody UserDto user){
        userService.create(user);
    }

    @PostMapping("/login")
    public void Login(@RequestBody UserDto user){
        userService.login(user);
    }

    @PutMapping
    public void Change(@RequestBody UserDto user){
        userService.changeRole(user);
    }

    @DeleteMapping
    public void Delete(@RequestBody UserDto user){
        userService.delete(user);
    }
}
