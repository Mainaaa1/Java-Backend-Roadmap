# Day 1 — DTOs & Mappers  
**Week 2: Advanced Spring Boot**

## Overview
Day 1 focuses on introducing **DTOs (Data Transfer Objects)** and **Mappers** to establish a clean separation between the API layer and the persistence layer.

This is a critical step toward building **maintainable, secure, and scalable** Spring Boot applications.

---

## Objectives
By the end of this day, you should understand and be able to:

- Why entities should **not** be exposed directly via APIs
- The role of DTOs in defining stable API contracts
- How to design **request DTOs** and **response DTOs**
- How to map between DTOs and entities using **manual mappers**
- How to refactor controllers to use DTOs instead of entities

---

## Key Concepts Covered
- DTO pattern (Request vs Response DTOs)
- Separation of concerns
- Manual mapping (without MapStruct)
- Cleaner controller design
- Preparation for validation and security layers

---

## Folder Structure Introduced
dto/
├── request/
│ └── CreateUserRequest.java
├── response/
│ └── UserResponse.java

mapper/
└── UserMapper.java


---

## Important Note
> **The working implementation for Day 1 is inside the existing Week 1 Spring Boot application folder.**

No new Spring Boot project was created for this day.  
All DTOs, mappers, and controller updates were applied **on top of the Week 1 Spring Boot app** to reflect real-world incremental development.

---

## API Behavior After Refactor
- Controllers no longer accept or return JPA entities
- All API input is handled via request DTOs
- All API output is returned via response DTOs
- Entities remain internal to the application

---
