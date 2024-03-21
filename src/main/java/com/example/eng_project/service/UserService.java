package com.example.eng_project.service;

import com.example.eng_project.controller.dto.UserDto;

public interface UserService {
    void create(UserDto user);
    void login(UserDto user);
    void changeRole(UserDto user);
    void delete(UserDto user);
}
