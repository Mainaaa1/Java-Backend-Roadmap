# Day 4 — Controllers, Routing, and MVC

This folder introduces **Spring Boot controllers and request routing**, forming the foundation of RESTful API development. The focus is on handling HTTP requests, mapping URLs to controller methods, and understanding the role of controllers in the MVC architecture.

---

## Objectives

- Create REST controllers using Spring Boot
- Define request mappings for different HTTP methods
- Understand how Spring handles incoming HTTP requests
- Return structured responses to clients

---

## Key Concepts

### REST Controllers
- `@RestController` annotation
- Handling HTTP requests and responses
- Returning data directly as JSON

### Request Mapping
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- Path variables and request parameters

### MVC in Spring Boot
- Controller as the entry point
- Service layer (introduced later)
- Separation of concerns

---

## Endpoints Implemented

| HTTP Method | Endpoint            | Description              |
|------------|---------------------|--------------------------|
| GET        | `/api/health`       | Application health check |
| GET        | `/api/users`        | Fetch all users          |
| GET        | `/api/users/{id}`   | Fetch user by ID         |
| POST       | `/api/users`        | Create a new user        |

---

## Project Structure

```text
demo-api/
├── src/main/java/com/example/demoapi/
│   ├── controller/
│   │   └── UserController.java
│   ├── model/
│   │   └── User.java
│   └── DemoApiApplication.java
