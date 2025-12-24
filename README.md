📚 Student Management System (Java)
📌 Project Overview

The Student Management System is a console-based Java application developed using core Object Oriented Programming (OOP) concepts.
It allows users to manage student records by adding and viewing student details such as roll number, name, age, and course through a menu-driven interface.

This mini project is developed as part of OOP’s Lab – Supplementary Assessment (Experiment 8) and demonstrates practical implementation of OOP principles in Java.

🎯 Objectives

To design a modular Java application using OOP concepts

To understand real-world usage of classes, inheritance, interfaces, packages, and exception handling

To build a menu-driven console application

🧩 OOP Concepts Used

Classes and Objects – Person, Student, StudentService

Inheritance – Student class extends Person

Interface – Manageable interface implemented by StudentService

Packages – Organized code into model, service, exception, and main

Exception Handling – Custom and built-in exceptions to handle invalid inputs

🗂 Project Structure
StudentManagementSystem/
│
├── model/
│   ├── Person.java
│   └── Student.java
│
├── service/
│   ├── Manageable.java
│   └── StudentService.java
│
├── exception/
│   └── InvalidAgeException.java
│
├── main/
│   └── MainApp.java
│
└── README.md

▶️ How to Compile and Run
Prerequisites

Java JDK installed (JDK 17 or above)

Command Prompt / Terminal or VS Code

Steps

Open terminal inside the project folder

Compile the program:

javac main/MainApp.java


Run the program:

java main.MainApp

🖥 Sample Features

Add student details

View all student records

Handles invalid input using exception handling

Menu-driven console interface
