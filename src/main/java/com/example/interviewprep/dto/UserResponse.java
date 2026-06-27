package com.example.interviewprep.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {

    private Long userId;
    private String username;
    private String email;
    private String role;
}
