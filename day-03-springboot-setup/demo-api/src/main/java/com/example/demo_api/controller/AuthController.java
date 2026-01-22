package com.example.demo_api.controller;

import com.example.demo_api.dto.LoginRequest;
import com.example.demo_api.dto.LoginResponse;
import com.example.demo_api.security.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        // TEMPORARY: no password validation yet
        // Proper auth comes later with Spring Security + UserDetailsService
        String token = jwtService.generateToken(request.getEmail());

        return new LoginResponse(token);
    }
}
