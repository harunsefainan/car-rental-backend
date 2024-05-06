package com.harunsefainan.carrentalbackend.services.auth;

import com.harunsefainan.carrentalbackend.dto.SignupRequest;
import com.harunsefainan.carrentalbackend.dto.UserDto;
import com.harunsefainan.carrentalbackend.entity.User;
import com.harunsefainan.carrentalbackend.enums.UserRole;
import com.harunsefainan.carrentalbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user =new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }
}
