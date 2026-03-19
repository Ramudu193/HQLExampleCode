# One-To-Many Mapping using Hibernate (Spring Boot + JPA)

## 📌 Project Description

This project demonstrates One-To-Many relationship mapping using Hibernate and Spring Boot JPA.

In this project, one parent entity is connected with multiple child entities using One-To-Many mapping.

This example helps to understand how relational database relationships are mapped into Java classes using Hibernate annotations.

This project is created as part of my Spring Boot and Hibernate practice.

---

## 🚀 Features

- Spring Boot application
- Hibernate ORM mapping
- One-To-Many relationship
- JPA annotations
- MySQL database connection
- Automatic table creation
- Data persistence using Hibernate

---

## 🛠 Technologies Used

- Java
- Spring Boot
- Hibernate
- Spring Data JPA
- MySQL
- Maven

---

## 📂 Concept Used

One-To-Many Mapping

Example:

One Student → Many Courses  
One Department → Many Employees  
One Customer → Many Orders  

---

## 📂 Example Mapping

### Parent Entity

```java
@Entity
public class Student {

    @Id
    @GeneratedValue
    int id;

    String name;

    @OneToMany
    List<Course> courses;

}
```

### Child Entity

```java
@Entity
public class Course {

    @Id
    @GeneratedValue
    int id;

    String courseName;

}
```

---

## 📂 Project Structure

```
one-to-many-project/
│
├── entity/
│   ├── Student.java
│   ├── Course.java
│
├── repository/
│
├── controller/
│
├── application.properties
│
└── README.md
```

---

## ▶ How to Run

1. Open project in IDE

- Spring Tool Suite
- IntelliJ
- VS Code

2. Configure database

```
spring.datasource.url=jdbc:mysql://localhost:3306/dbname
spring.datasource.username=root
spring.datasource.password=****
spring.jpa.hibernate.ddl-auto=update
```

3. Run main class

```
SpringBootApplication.java
```

4. Test using Postman / Browser

```
http://localhost:8080
```

---

## 🎯 Learning Purpose

- Understand Hibernate mapping
- Learn One-To-Many relationship
- Learn JPA annotations
- Learn database relations
- Improve backend skills

---

## 👨‍💻 Author

Ramudu Gurrapu  
Java Full Stack Developer  
GitHub: https://github.com/Ramudu193  
Email: gurrapuramudu11@gmail.com

---
