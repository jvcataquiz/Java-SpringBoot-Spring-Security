# Java Spring Boot Spring Security Integration

## Overview
This project demonstrates **user authentication and authorization** using **Spring Security** in a **Spring Boot** application. It supports secure login, JWT-based authentication, role-based access control (RBAC), and protects RESTful APIs, providing a scalable and maintainable security solution for microservices.

## Features
- **User authentication** with username and password.
- **JWT token generation and validation** for stateless authentication.
- **Role-based access control (RBAC)** to secure endpoints.
- **Password encryption** using BCrypt.
- Secure RESTful APIs with protected and public endpoints.
- Unit testing for controllers and service layers.

## Technology Stack
- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Maven/Gradle

Dependencies
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>

Security Features

Stateless authentication using JWT.

Password encryption using BCryptPasswordEncoder.

Endpoint protection with role-based access.

Token expiration handling and validation.

Exception handling for unauthorized access.

Benefits

Secure microservices and REST APIs.

Centralized authentication and authorization.

Scalable and maintainable security architecture.

Easy integration with frontend or mobile applications.

License

This project is licensed under the MIT License.
