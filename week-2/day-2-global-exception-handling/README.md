# Day 2 — Global Exception Handling  
**Week 2 · Advanced Spring Boot**

## Objective

Implement centralized, consistent error handling in a Spring Boot REST API.  
This day focuses on removing error-handling logic from controllers and enforcing clean, REST-compliant responses using global exception handling.

---

## Concepts Covered

- Why global exception handling matters
- Custom runtime exceptions
- `@ControllerAdvice` / `@RestControllerAdvice`
- `@ExceptionHandler`
- HTTP status codes and REST error semantics
- Cleaner controller code

---

## Important Note
> **The working implementation for Day 2 is inside the existing Week 1 Spring Boot application folder.**

No new Spring Boot project was created for this day.  
All DTOs, mappers, and controller updates were applied **on top of the Week 1 Spring Boot app** to reflect real-world incremental development.

---

## Implementation Overview

All changes extend the **Week 1 Spring Boot application**.  
No new project was created.

---

## 1. Custom Exception

A domain-specific exception for missing resources.

### Package

com.example.demo_api.exception


### Code

```java
package com.example.demo_api.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
```

## 2. Global Exception Handler

Centralized error handling using @RestControllerAdvice.

Package
com.example.demo_api.exception

### Code

```java
package com.example.demo_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }
}
```

## 3. Controller Refactor

Controllers no longer return null.
Missing resources now trigger exceptions that are handled globally.

Before
```java
return userRepository.findById(id).orElse(null);
```

After
```java
return userRepository.findById(id)
        .orElseThrow(() ->
            new ResourceNotFoundException("User not found with id: " + id)
        );

Example Endpoint (Refactored)
@GetMapping("/{id}")
public User getUserById(@PathVariable Long id) {
    return userRepository.findById(id)
            .orElseThrow(() ->
                new ResourceNotFoundException("User not found with id: " + id)
            );
}
```

## API Behavior

| Scenario         | Status Code       | Response         |
| ---------------- | ----------------- | ---------------- |
| Resource exists  | `200 OK`          | JSON payload     |
| Resource missing | `404 NOT FOUND`   | Error message    |
| Invalid request  | `400 BAD REQUEST` | Validation error |

## Why This Matters
### Without global exception handling

* Controllers become cluttered
* Error responses are inconsistent
* Clients receive unclear feedback
  
### With global exception handling
* Errors are handled in one place
* Controllers stay focused on business logic
* APIs follow REST standards

## Completion Checklist

* Custom exception created
* Global exception handler implemented
* Controllers refactored to throw exceptions
* No null responses from endpoints
* Proper HTTP status codes returned
