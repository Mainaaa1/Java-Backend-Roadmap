# Day 3 — Spring Security Overview  
Week 2 · Advanced Spring Boot

## Objective

Understand the fundamentals of **Spring Security** and how it protects a Spring Boot application.  
This day is **conceptual and structural**, laying the groundwork for JWT-based authentication in the coming days.

No authentication is implemented yet — the focus is **how Spring Security works**, not configuration overload.

---

## Concepts Covered

- What Spring Security is and why it exists
- Authentication vs Authorization
- Security filter chain
- Default Spring Security behavior
- Stateless vs stateful security
- Role of JWT in modern APIs

---

## Important Note
> **The working implementation for Day 3 is inside the existing Week 1 Spring Boot application folder.**

No new Spring Boot project was created for this day.  
All DTOs, mappers, and controller updates were applied **on top of the Week 1 Spring Boot app** to reflect real-world incremental development.

---

## What Is Spring Security?

Spring Security is a powerful framework that provides:

- Authentication (Who are you?)
- Authorization (What are you allowed to do?)
- Protection against common attacks (CSRF, session fixation, etc.)

It works by intercepting HTTP requests **before they reach controllers**.

---

## Authentication vs Authorization

| Concept | Meaning | Example |
|------|--------|--------|
| Authentication | Verifying identity | Logging in with username/password |
| Authorization | Verifying permissions | Accessing `/admin` only as ADMIN |

Authentication happens **first**, authorization happens **after**.

---

## The Security Filter Chain

Spring Security operates using a chain of servlet filters.

Request
↓
Security Filters
↓
Controller

Each filter has a responsibility:
- Authentication
- Authorization
- Exception handling
- Context propagation

Once a request fails a filter, it never reaches the controller.

---

## Default Spring Security Behavior

When `spring-boot-starter-security` is added:

- All endpoints are secured by default
- A login form is auto-generated
- HTTP Basic authentication is enabled
- A default user is created in memory

Example console output:

Using generated security password: xxxxxxxx


This behavior is **temporary and not production-ready**.

---

## Stateful vs Stateless Security

### Stateful (Session-Based)
- Server stores session
- Common in traditional MVC apps
- Requires cookies

### Stateless (Token-Based)
- Server does not store session
- Client sends token on every request
- Scales better for APIs

JWT is used for **stateless authentication**.

---

## Why JWT?

JWT (JSON Web Token):
- Is self-contained
- Is stateless
- Works well with REST APIs
- Avoids server-side session storage

JWT will be implemented on **Day 4 & Day 5**.

---

## What Was (and Was NOT) Done Today

### Done
- Studied Spring Security architecture
- Understood filter chains
- Clarified authentication vs authorization
- Prepared mental model for JWT security

### Not Done (Intentionally)
- No JWT implementation
- No login endpoints
- No password encoding
- No security configuration yet

Rushing security setup without understanding leads to fragile systems.

---

## Repository Impact

No new code added today.  
This day serves as a **design and understanding checkpoint** before implementation begins.

---

## Key Takeaways

- Spring Security works *before* controllers
- Security is filter-based, not annotation-based
- JWT enables stateless authentication
- Understanding the flow matters more than memorizing config

---

