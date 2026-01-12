# Polymorphism — Dynamic Behavior Through Abstraction

This folder demonstrates **polymorphism in Java**, a core object-oriented concept that allows objects of different types to be treated uniformly while exhibiting **different behavior at runtime**. The examples use modern, backend-relevant domain models to illustrate how polymorphism enables flexible and extensible system design.

---

## Concept Overview

Polymorphism allows a superclass reference to point to different subclass objects, with method calls being resolved **at runtime** based on the actual object type. This eliminates conditional logic and enables clean, extensible code.

In Java, polymorphism is achieved through:
- Method overriding
- Abstract classes or interfaces
- Runtime method dispatch

---

## Concepts Demonstrated

### Abstract Base Class
- Defining abstract classes using the `abstract` keyword
- Declaring abstract methods to enforce subclass behavior
- Preventing direct instantiation of base classes

### Method Overriding
- Providing subclass-specific implementations of a method
- Using the `@Override` annotation for correctness and clarity
- Maintaining consistent method signatures

### Runtime Dispatch
- Calling overridden methods through base-class references
- Resolving method implementations at runtime
- Avoiding `if/else` and `instanceof` checks

### Polymorphic Method Calls
- Designing methods that accept base types
- Allowing behavior to vary based on actual object type
- Promoting extensibility without code modification

---

## Domain Model Used

The examples model a **user access system**, commonly found in backend applications:

- `User` (abstract base class)
  - Defines shared identity and lifecycle behavior
  - Declares an abstract access-level contract

- `AdminUser`
  - Provides administrative-level access behavior

- `CustomerUser`
  - Provides customer-level access behavior

A service-layer class demonstrates how polymorphism is used in practice to operate on different user types uniformly.

---

## Design Principles Applied

- **Open/Closed Principle**  
  New user types can be added without modifying existing logic.

- **Single Responsibility**  
  Each class models a clear, focused responsibility.

- **Loose Coupling**  
  High-level code depends on abstractions, not concrete implementations.

- **Maintainability**  
  Behavior changes are localized to specific subclasses.

---

## Learning Objectives

By completing the examples in this folder, I was able to:

- Explain polymorphism and its role in object-oriented design
- Use abstract classes and overridden methods effectively
- Understand how Java resolves method calls at runtime
- Design extensible systems without conditional branching
- Recognize how polymorphism underpins Spring Boot service design

---

## Notes

- Interfaces and multiple implementations are covered in the next folder to build on these concepts.
- These examples intentionally avoid framework-specific code to focus on core language fundamentals.

This folder represents a **key transition from basic OOP syntax to scalable application design**, forming the foundation for interface-driven and dependency-injected systems used in Spring Boot.
