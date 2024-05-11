package com.harunsefainan.carrentalbackend.dto;

import com.harunsefainan.carrentalbackend.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
    private UserRole userRole;
    private Long userId;
}
