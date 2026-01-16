# Day 5 — JPA & Hibernate CRUD

This day introduces **data persistence** using Spring Data JPA and Hibernate.
The application evolves from in-memory storage to a database-backed system
with full CRUD (Create, Read, Update, Delete) operations.

---

## Objectives

- Understand ORM (Object Relational Mapping)
- Use JPA annotations to map Java objects to database tables
- Create repositories using Spring Data JPA
- Perform CRUD operations via REST endpoints

---

## Key Concepts

### JPA & Hibernate
- JPA is a specification for ORM
- Hibernate is the JPA implementation used by Spring Boot
- Entities represent database tables

### Repositories
- `JpaRepository` provides CRUD operations out of the box
- No SQL required for basic operations

### Persistence Layer
- Controllers delegate data access to repositories
- Database handles storage instead of memory

---

## Project Structure (Updated)

```text
demo-api/
├── controller/
│   └── UserController.java
├── model/
│   └── User.java
├── repository/
│   └── UserRepository.java
└── DemoApiApplication.java
