# Inheritance — Extending and Reusing Behavior in Java

This folder demonstrates **inheritance in Java** using modern, real-world domain examples commonly found in backend and enterprise applications. The goal is to show how shared behavior and state can be abstracted into a base class and extended by more specialized subclasses.

---

## Concept Overview

Inheritance allows one class (a subclass) to **reuse and extend** the properties and behavior of another class (a superclass). It promotes code reuse, reduces duplication, and enables logical hierarchies within an application.

In Java, inheritance is implemented using the `extends` keyword.

---

## Concepts Demonstrated

### Superclass and Subclass Relationship
- Defining a base class that contains shared fields and methods
- Creating subclasses that extend the base class
- Establishing an *“is-a”* relationship between objects

### Access Modifiers
- Using `protected` fields and methods to allow subclass access
- Understanding visibility rules across class hierarchies

### Constructor Chaining
- Calling superclass constructors using `super(...)`
- Ensuring proper object initialization across inheritance levels

### Method Reuse
- Inheriting behavior without rewriting logic
- Leveraging common methods across multiple subclasses

---

## Domain Model Used

Instead of generic examples, this folder models a **user system** similar to what is used in web platforms and APIs.

### Base Class
- `User`
  - Contains common attributes such as ID, name, email
  - Defines shared behavior like displaying user details

### Subclasses
- `AdminUser`
  - Extends `User`
  - Adds admin-specific properties or permissions

- `CustomerUser`
  - Extends `User`
  - Adds customer-related data such as loyalty points or account status

This structure reflects real backend systems where different user roles share core identity data but differ in capabilities.

---

## Design Principles Applied

- **Single Responsibility**  
  Each class models a clear role within the system.

- **Code Reuse**  
  Common logic is defined once in the superclass.

- **Logical Hierarchy**  
  Subclasses represent specialized versions of the base class.

- **Maintainability**  
  Changes to shared behavior occur in one place.

---

## Learning Objectives

By studying and implementing the examples in this folder, the learner should be able to:

- Identify when inheritance is appropriate
- Design meaningful class hierarchies
- Use `extends` and `super` correctly
- Avoid duplicating shared logic across classes
- Understand inheritance as a foundation for polymorphism

---

## Notes

- Method overriding and runtime polymorphism are intentionally **not** covered here and are explored in the `polymorphism/` folder.
- Interfaces and abstraction are handled separately to maintain conceptual clarity.

This folder builds directly on the `classes/` fundamentals and prepares the ground for advanced OOP concepts used extensively in Spring Boot and enterprise Java development.
