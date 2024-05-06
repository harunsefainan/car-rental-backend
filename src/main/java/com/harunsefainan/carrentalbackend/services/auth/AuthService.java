package com.harunsefainan.carrentalbackend.services.auth;

import com.harunsefainan.carrentalbackend.dto.SignupRequest;
import com.harunsefainan.carrentalbackend.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
