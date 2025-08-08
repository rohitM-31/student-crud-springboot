# 🎓 Student Database Management - CRUD (Spring Boot)

A simple **Student Management** CRUD (Create, Read, Update, Delete) application built with **Spring Boot**, **Spring Data JPA**, and **MySQL**.

---

## 🚀 Features
- Add a new student
- View all students
- View a student by ID
- Update student details
- Delete a student

---

## 🛠 Tech Stack
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL** (or H2 for in-memory testing)
- **Maven**
- **REST API**

---

## 📂 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET`  | `/api/students/all` | Get all students |
| `GET`  | `/api/students/get/{id}` | Get student by ID |
| `POST` | `/api/students/add` | Create a new student |
| `PUT`  | `/api/students/update/{id}` | Update student |
| `DELETE` | `/api/students/delete/{id}` | Delete student |

---

## 📦 JSON Example for POST
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "age": 22,
  "rollNumber": 101,
  "mobileNumber": 9876543210
}
