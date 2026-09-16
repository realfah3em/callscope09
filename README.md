# 📞 CallScope

> A small Java project built to practice and understand **Object-Oriented Programming (OOP)** through a practical call-center domain model.

---

## 📖 About

CallScope models a simple call-analysis scenario using Java classes and objects.

The current focus is not on building a production-ready application, but on **learning Java by building** and understanding how different objects represent and relate to real-world entities.

---

## 🧠 Current Concepts

The project currently focuses on:

- Classes and Objects
- Fields and Properties
- Constructors
- Encapsulation
- Getters and Setters
- Abstract Classes
- Inheritance
- Object Relationships
- Arrays of Objects

---

## 🏗️ Domain Model

```text
Person
├── Agent
└── Customer

Call
├── Agent
├── Customer
└── Transcript
    └── Turn[]
```

The main domain classes are:

- `Person`
- `Agent`
- `Customer`
- `Call`
- `Transcript`
- `Turn`
- `ScoreCard`
- `Violation`

---

## 🚧 Current Progress

At the current stage, the project includes:

- Agent objects
- Customer objects
- Multiple `Turn` objects
- A `Turn[]` array containing conversation turns
- A `Transcript` object containing those turns
- A `Call` object connecting the relevant objects

### Example relationship

```text
Call
 ├── Agent
 ├── Customer
 └── Transcript
       └── Turn[]
```

---

## 📁 Project Structure

```text
callscope/
├── Person.java
├── Agent.java
├── Customer.java
├── Call.java
├── Transcript.java
├── Turn.java
├── ScoreCard.java
├── Violation.java
└── Main.java
```

---

## 🎯 Purpose

CallScope is primarily a **learning project**.

The goal is to understand how Java OOP concepts work together by gradually turning a real-world scenario into Java classes, objects, and relationships.

More functionality will be added as I continue learning Java.
