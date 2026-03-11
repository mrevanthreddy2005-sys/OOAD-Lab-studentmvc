# OOAD Lab – Student Management System (MVC)

This project is a **Student Management System** developed using **Spring Boot MVC Architecture** as part of the **Object-Oriented Analysis and Design (OOAD) Lab**.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

## MVC Architecture

### Model
Represents the data structure of the application.

- `Student.java`
- Contains fields:
  - id (auto-generated)
  - name
  - email
  - course

### Repository
Handles database operations using JPA.

- `StudentRepository.java`
- Extends `JpaRepository`

### Service
Contains business logic.

- `StudentService.java`
- Methods:
  - saveStudent()
  - getAllStudents()

### Controller
Handles HTTP requests and responses.

- `StudentController.java`
- Endpoints:
  - `GET /` → Display student form and list
  - `POST /save` → Save student data

### View
User interface using Thymeleaf.

- `index.html`
- Features:
  - Student Registration Form
  - Student List Table

## Database
- H2 In-Memory Database
- Configured in `application.properties`

## Application Features
- Add new student
- View student list
- Auto-generated student ID
- Data stored in database
- MVC architecture implementation

## How to Run

Clone the repository:

```bash
git clone https://github.com/mrevanthreddy2005-sys/OOAD-Lab-studentmvc.git
