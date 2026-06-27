package com.example.interviewprep.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    @Email
    @NotBlank(message = "Email is required")
    @Size(max = 254, message = "Email must not exceed 254 characters")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 128, message = "Password must be between 6 and 128 characters")
    private String password;
}
