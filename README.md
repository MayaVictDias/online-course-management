# 🎓 Online Course Management System

A **RESTful API** developed in **Java with Spring Boot**, designed to manage courses, instructors, students, and enrollments in an online learning platform.

---

## 🧩 Purpose

The goal of this project is to create a robust and scalable API that enables full management of online courses, focusing on backend development best practices and entity relationships.

---

## 🗂️ Main Entities

### 📘 Course
- `id`: Long
- `name`: String
- `description`: String
- `workload`: Integer

### 👨‍🏫 Instructor
- `id`: Long
- `name`: String
- `email`: String
- `specialty`: String

### 👨‍🎓 Student
- `id`: Long
- `name`: String
- `email`: String
- `birthDate`: LocalDate

### 📝 Enrollment
- `id`: Long
- `student`: Relationship with Student
- `course`: Relationship with Course
- `enrollmentDate`: LocalDate

---

## 📌 Features

- Full CRUD for Course, Instructor, and Student
- One **Instructor** can teach multiple **Courses**
- One **Student** can enroll in multiple **Courses**
- Prevent duplicate enrollments of the same student in the same course
- Endpoint to list all courses of a student (by `id`)
- Endpoint to list all students of a course (by `id`)
- Standardized API responses (avoid direct return of JPA entities)
- Pagination and sorting on listing endpoints

---

## 💽 Technologies and Tools

- ☕ **Java 17+**
- 🌱 **Spring Boot**
- 📦 **Spring Data JPA**
- 🐘 **PostgreSQL**
- 🐳 **Docker** (for development environment and database)
- ⚙️ **Maven**
- 📌 **Lombok** (to reduce boilerplate code)

---

## 🚀 How to Run

### Prerequisites

- Java 17+
- Maven
- Docker and Docker Compose

### Steps to run the project

1. Clone the repository:
   ```bash
   git clone https://github.com/MayaVictDias/online-course-management.git
   cd online-course-management


2. Start the PostgreSQL container using Docker:
    ```bash
   docker-compose up -d

3. Run the application:
    ```bash
   ./mvnw spring-boot:run
   
### 🔧 Project Structure

```pgsql
src/
├── main/
│   ├── java/
│   │   └── com.exemplo.cursos/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── model/
│   │       ├── repository/
│   └── resources/
│       ├── application.yml
│       └── data.sql

```