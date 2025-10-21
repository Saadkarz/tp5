# Spring-Hibernate Demo

A simple Java project demonstrating the integration of Spring Framework with Hibernate ORM for database operations.

## Project Overview

This project showcases how to:
- Configure Spring Framework with Hibernate ORM
- Use Spring's dependency injection for database operations
- Implement a DAO pattern with Spring annotations
- Manage transactions with Spring's `@Transactional` annotation

## Technologies Used

- **Java**: 21
- **Spring Framework**: 6.0.11
- **Hibernate ORM**: 6.2.7.Final
- **MySQL**: 8.0.33
- **Maven**: Build and dependency management

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── dao/            # Data Access Object interfaces
│   │   ├── entities/       # JPA Entity classes
│   │   ├── metier/         # DAO implementations
│   │   ├── Presentation/   # Main application classes
│   │   └── util/           # Configuration classes
│   └── resources/
│       └── application.properties  # Database configuration
└── test/
    └── java/
        └── TestHibernate.java  # Test class
```

## Prerequisites

- Java 21 or higher
- MySQL database server
- Maven 3.6+

## Configuration

Update the `src/main/resources/application.properties` file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Building the Project

```bash
mvn clean install
```

## Running the Application

Run the main class:
- `TestHibernate.java` - Tests Spring and Hibernate configuration
- `Presentation2.java` - Demo application for CRUD operations

## Features

- **Spring Configuration**: Annotation-based configuration using `@Configuration`, `@ComponentScan`
- **Transaction Management**: Automatic transaction handling with `@Transactional`
- **Hibernate Integration**: ORM mapping with JPA annotations
- **DAO Pattern**: Clean separation of data access logic

## Notes

- This project uses **Jakarta EE** namespace (jakarta.persistence.*) instead of the older javax.persistence.* due to Spring 6 and Hibernate 6 requirements
- MySQL dialect is automatically detected by Hibernate
- DDL auto mode is configured in application.properties (create, update, validate, etc.)

## Author
Karzouz Saad
## Screenshots
<img width="1733" height="1036" alt="Screenshot 2025-10-21 231027" src="https://github.com/user-attachments/assets/eb4b7246-6508-4c9e-94a3-0d9f220eaaa5" />
<img width="1804" height="1093" alt="Screenshot 2025-10-21 230957" src="https://github.com/user-attachments/assets/8b1738d6-12c0-4b2f-ad5e-817fd431bff0" />


