package com.example.eng_project.controller.dto;

import com.example.eng_project.entity.UserRole;

public record UserDto(String username, String password, UserRole role) {

}
