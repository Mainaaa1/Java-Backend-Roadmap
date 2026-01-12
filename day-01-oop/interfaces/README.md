# Interfaces — Defining Contracts and Enabling Loose Coupling

This folder demonstrates the use of **interfaces in Java** to define clear contracts between components and enable **loose coupling**, a fundamental principle in modern backend and Spring Boot applications.

Interfaces represent *what* a class can do, without prescribing *how* it does it.

---

## Concept Overview

An interface in Java defines a set of method signatures that implementing classes must provide. Unlike inheritance, interfaces focus on **capabilities and roles** rather than class hierarchy.

Interfaces are heavily used in:
- Service layers
- API design
- Dependency injection frameworks (e.g., Spring)
- Testable and extensible system architectures

---

## Concepts Demonstrated

### Interface Definition
- Declaring interfaces using the `interface` keyword
- Defining method contracts without implementations
- Using interfaces to represent roles or capabilities

### Interface Implementation
- Implementing interfaces using the `implements` keyword
- Providing concrete method implementations
- Using `@Override` for correctness and clarity

### Programming to an Interface
- Referencing objects by interface type
- Decoupling high-level logic from concrete classes
- Enabling easy replacement of implementations

### Multiple Implementations
- Creating multiple classes that implement the same interface
- Selecting behavior at runtime without conditional logic
- Supporting extensibility and testability

---

## Domain Model Used

The examples model a **notification system**, a common backend requirement.

### Interface
- `NotificationService`
  - Defines a contract for sending notifications

### Implementations
- `EmailNotificationService`
  - Sends notifications via email

- `SmsNotificationService`
  - Sends notifications via SMS

A client class uses the interface without knowledge of the concrete implementation, reflecting real-world service design.

---

## Design Principles Applied

- **Dependency Inversion Principle**  
  High-level modules depend on abstractions, not concrete implementations.

- **Loose Coupling**  
  Implementations can change without affecting consumers.

- **Open/Closed Principle**  
  New implementations can be added without modifying existing code.

- **Testability**  
  Interfaces allow mocking and substitution during testing.

---

## Learning Objectives

By working through the examples in this folder, I was able to:

- Explain the role of interfaces in Java
- Design meaningful service contracts
- Implement multiple strategies behind a single interface
- Understand how Spring uses interfaces for dependency injection
- Write flexible, maintainable backend code

---

## Notes

- These examples intentionally avoid framework annotations to focus on core Java principles.
- In Spring Boot, interfaces are commonly paired with `@Service` implementations and injected using `@Autowired` or constructor injection.

This folder represents the **final step in core OOP fundamentals** before moving into full Spring Boot application development.
