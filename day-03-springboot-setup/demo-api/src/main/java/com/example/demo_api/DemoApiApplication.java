package com.example.demo_api;

import com.example.demo_api.model.User;
import com.example.demo_api.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiApplication.class, args);
    }

    // Add this method to populate sample users at startup
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User(null, "Alice", "alice@example.com"));
            userRepository.save(new User(null, "Bob", "bob@example.com"));
            userRepository.save(new User(null, "Charlie", "charlie@example.com"));
        };
    }
}
