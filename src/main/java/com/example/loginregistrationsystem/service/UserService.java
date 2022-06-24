package com.example.loginregistrationsystem.service;

import com.example.loginregistrationsystem.model.User;
import com.example.loginregistrationsystem.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
