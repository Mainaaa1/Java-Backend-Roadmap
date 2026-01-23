# Day 5 — API Best Practices  
**Week 2 · Advanced Spring Boot**  
**Date:** Fri, 23 Jan 2026

---

## Objective

Improve the quality, consistency, and professionalism of the REST API by applying **industry-standard API best practices**.  
The focus today is not on adding new features, but on **making the API clean, predictable, and production-ready**.

---

## Key Concepts Covered

### 1. Proper HTTP Status Codes
Using the correct status codes to clearly communicate API outcomes:

- `200 OK` — Successful GET/PUT
- `201 Created` — Resource created successfully
- `204 No Content` — Successful DELETE
- `400 Bad Request` — Validation errors / bad input
- `404 Not Found` — Resource does not exist
- `500 Internal Server Error` — Unexpected server issues

---

### 2. Consistent API Responses
Avoid returning raw entities or `null`.

- Errors return structured JSON
- Success responses are predictable
- Clients can reliably parse responses

Example error response:
```json
{
  "timestamp": "2026-01-23T14:20:00",
  "status": 404,
  "error": "Not Found",
  "message": "User not found with id 10",
  "path": "/api/users/10"
}
```

### 3. Validation of Request Data

- Prevent invalid data from entering the system.
- Bean Validation (@NotBlank, @Email, etc.)
- Validation applied at DTO level
- Invalid requests fail fast with meaningful messages

### 4. Separation of Concerns

- Each layer has a clear responsibility:
- Controller → Handles HTTP & request/response
- Service → Business logic
- Repository → Database access
- DTOs → External API contract
- Entities → Persistence model

### This improves:

- Maintainability
- Testability
- Refactoring safety

### 5. Avoiding Entity Exposure

Entities are no longer returned directly to clients.

- DTOs define what the API exposes
- Internal changes do not break consumers
- Prevents accidental data leaks

### 6. Clear & Predictable Endpoints

RESTful naming conventions applied:

 ```/api/users```

```/api/users/{id}```

No verbs in URLs, behavior is driven by HTTP methods.

### Key Takeaways

- A working API is not the same as a good API
- Consistency matters more than cleverness
- Clients should never guess how your API behaves
- Today’s refactors prevent tomorrow’s production bugs

### Challenges Faced

- Resisting the urge to “just return the entity”
- Refactoring controllers without breaking behavior
- Understanding where validation truly belongs
- Realizing how messy APIs get without standards

### Outcome

By the end of Day 5, the API:

- Uses correct HTTP semantics
- Has predictable responses
- Is safer for frontend and third-party consumption
- Looks and behaves like a real production API
