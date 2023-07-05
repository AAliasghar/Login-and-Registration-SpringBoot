package com.ali.springbootblogrestapi.springbootblogrestapi.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
