# Day 7 — Test & Document API  
**Week 2 · Advanced Spring Boot**  
 Sunday, 25 Jan 2026

---

## Objective

Day 7 focused on **testing, validating, and documenting** the JWT-secured API built throughout Week 2.

The goal was to ensure the API is:
- Correct
- Secure
- Understandable to other developers
- Ready for real-world consumption

This day emphasizes **quality, clarity, and confidence** in the backend system.

---

## Key Concepts Covered

- API testing strategies
- Manual testing of secured endpoints
- HTTP status code validation
- Error response consistency
- API documentation basics
- Developer experience (DX)

---

## API Testing

### Manual Testing

The API was tested using HTTP clients (browser tools / REST clients):

- Authentication flow (`/auth/login`)
- Token issuance and usage
- Authorization enforcement
- CRUD operations under JWT protection

Test cases included:
- Missing token → `401 Unauthorized`
- Invalid token → `401 Unauthorized`
- Valid token → `200 OK`
- Non-existent resource → `404 Not Found`

---

### Endpoint Coverage

| Endpoint | Method | Secured | Result |
|--------|--------|--------|--------|
| `/auth/login` | POST | NO | Working |
| `/api/users` | GET | YES | Working |
| `/api/users/{id}` | GET | YES | Working |
| `/api/users` | POST | YES | Working |
| `/api/users/{id}` | PUT | YES | Working |
| `/api/users/{id}` | DELETE | YES | Working |

---

## API Documentation

### Documentation Strategy

At this stage, documentation focuses on:
- Clear endpoint structure
- Request/response examples
- Authentication requirements
- Common error responses

This prepares the ground for:
- Swagger / OpenAPI integration
- Team collaboration
- Frontend consumption

---

## Authentication Documentation

### Authorization Header

All protected endpoints require:

Authorization: Bearer <JWT_TOKEN>

Failure to include this header results in: 401 Unauthorised


---

## Error Handling Review

The global exception handling implemented earlier was verified:

- Consistent error format
- Proper HTTP status codes
- No stack traces leaked to clients

Example error response:
```json
{
  "status": 404,
  "message": "User not found",
  "timestamp": "2026-01-25T10:15:30"
}
```
### Architecture Review

By the end of Week 2, the application follows:

- Controller → DTO → Service → Repository flow
- Stateless security model
- Centralized error handling
- Clear package boundaries
- Extendable security design

### Outcomes

- Fully tested JWT-secured REST API
- Verified authentication & authorization
- Clear API usage patterns
- Improved confidence in system behavior
- Week 2 successfully completed

### Lessons Learned

- Security bugs often come from misconfiguration, not code
- Testing is as important as implementation
- Documentation is part of development, not an afterthought
- A “working API” is not the same as a usable API

### Week 2 Summary

Week 2 introduced professional backend practices:

- DTOs & clean architecture
- Global exception handling
- Spring Security fundamentals
- JWT-based authentication
- Secure API design
- Testing & documentation
