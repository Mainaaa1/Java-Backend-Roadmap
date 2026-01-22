# Day 4 — JWT Token-Based Authentication  
Week 2 · Advanced Spring Boot

## Objective

Implement **JWT-based authentication** in a Spring Boot REST API.  
This day focuses on **issuing, validating, and using JSON Web Tokens (JWT)** to secure endpoints in a **stateless** manner.

By the end of today, the API can:
- Authenticate users
- Issue JWTs
- Protect endpoints using tokens
- Reject unauthorized requests cleanly

---

## Why JWT?

Traditional session-based authentication does not scale well for APIs.

JWT provides:
- Stateless authentication
- Horizontal scalability
- No server-side session storage
- Easy integration with frontend clients

Each request carries proof of authentication.

---

## Authentication Flow (High Level)

Client → Login Request (username/password)
↓
Server → Validate credentials
↓
Server → Generate JWT
↓
Client → Store token
↓
Client → Send token on every request
↓
Server → Validate token → Allow / Deny

---

## JWT Structure

A JWT consists of three parts:

header.payload.signature


### Header
- Algorithm used (HS256)
- Token type (JWT)

### Payload
- User identifier
- Roles / claims
- Expiration time

### Signature
- Ensures token integrity
- Prevents tampering

---

## Components Introduced

### 1. Authentication Controller
Handles login requests and token generation.

Example responsibility:
- Accept credentials
- Authenticate user
- Return JWT

---

### 2. JWT Utility / Service
Responsible for:
- Generating tokens
- Validating tokens
- Extracting claims (username, roles)

This logic is **isolated** from controllers.

---

### 3. JWT Filter
Intercepts incoming requests:
- Reads `Authorization` header
- Extracts Bearer token
- Validates token
- Sets authentication context

Runs **before controllers**.

---

### 4. Security Configuration
Defines:
- Public endpoints (`/auth/login`)
- Secured endpoints (`/api/**`)
- Stateless session policy
- Custom JWT filter registration

---

## Stateless Security Configuration

Key configuration choices:
- `SessionCreationPolicy.STATELESS`
- CSRF disabled (API use-case)
- Authentication via headers only

No sessions. No cookies. No magic.

---

## Authorization Header Format

All secured requests must include:

Authorization: Bearer <JWT_TOKEN>


Missing or invalid tokens result in:
- `401 Unauthorized`
- `403 Forbidden`

---

## What Was Implemented Today

- Login endpoint
- JWT generation logic
- Token validation
- Security filter chain
- Stateless authentication setup
- Protected API endpoints

---

## What Was NOT Implemented Yet

- Role-based authorization
- Refresh tokens
- Password hashing strategies
- API documentation for auth endpoints

These will be addressed incrementally.

---

## Common Pitfalls Avoided

- Storing JWTs server-side
- Putting business logic in filters
- Exposing sensitive claims
- Over-configuring security too early

---

## Repository Impact

All JWT and security-related code lives alongside the existing Spring Boot application.

The application now enforces authentication on protected routes.

---

## Key Takeaways

- JWT enables stateless authentication
- Security runs before controllers
- Filters are the backbone of Spring Security
- Clean separation of concerns matters

---
