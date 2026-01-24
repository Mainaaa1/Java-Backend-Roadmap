package com.example.demo_api.auth;

import com.example.demo_api.security.JwtTokenProvider;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenProvider tokenProvider;

    public AuthController(JwtTokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        // DEMO ONLY (Day 6 scope)
        if (!"admin".equals(request.username) || !"password".equals(request.password)) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = tokenProvider.generateToken(request.username);
        return new LoginResponse(token);
    }
}
