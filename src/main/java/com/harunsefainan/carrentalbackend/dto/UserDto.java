package com.harunsefainan.carrentalbackend.dto;

import com.harunsefainan.carrentalbackend.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;

}
