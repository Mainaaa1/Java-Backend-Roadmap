# Day 6 — Build JWT-Secured API  
**Week 2 · Advanced Spring Boot**  
 Saturday, 24 Jan 2026

---

## Objective

The goal of Day 6 was to **secure the existing Spring Boot REST API using JWT (JSON Web Tokens)**.  
This marks the transition from *open APIs* to **production-style secured APIs**.

By the end of the day, the API:
- Authenticates users via a login endpoint
- Issues JWT tokens
- Protects all business endpoints
- Operates in a **stateless** manner (no sessions)

---

## Key Concepts Covered

- Spring Security filter chain
- Stateless authentication
- JWT structure (Header, Payload, Signature)
- Token generation and validation
- Request filtering with `OncePerRequestFilter`
- Securing endpoints selectively
- Authorization headers (`Bearer <token>`)

---

## Package Structure Added

com.example.demo_api
├── auth
│ ├── AuthController.java
│ ├── LoginRequest.java
│ └── LoginResponse.java
│
├── security
│ ├── JwtAuthenticationFilter.java
│ ├── JwtTokenProvider.java
│ └── SecurityConfig.java


Security-related logic is intentionally isolated from business logic.

---

## Authentication Flow

1. Client sends credentials to `/auth/login`
2. Server validates credentials
3. Server generates a JWT
4. Client stores token
5. Client sends token with every protected request
6. Security filter validates token before controller execution

---

## Login Endpoint

**POST**
/auth/login


**Request Body**
```json
{
  "username": "admin",
  "password": "password"
}
```
Response
```
{
  "token": "<JWT_TOKEN>"
}
```

### Security Configuration Highlights

- CSRF disabled (stateless API)
- Sessions disabled
- JWT filter runs before Spring Security authentication
- Frame options disabled for H2 console
- Explicit endpoint whitelisting

 ### Challenges Faced

- Understanding filter execution order
- Differentiating authentication vs authorization
- Debugging 401 errors with missing headers
- Avoiding stateful session behavior

 ### Notes

- Password hashing and database-backed users will be introduced later
- Roles and permissions are intentionally deferred
- This implementation prioritizes clarity over completeness
