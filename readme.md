# Spring Boot Base Project

This project serves as a foundation for future Spring Boot applications. It includes essential features such as database connectivity, security, transaction management, and unit testing configurations. It aims to provide a standardized starting point to accelerate development and maintain consistency across multiple projects.

## Features

- **Spring Boot Setup**: Pre-configured Spring Boot application with commonly used dependencies.
- **Database Connection**: Supports connection to various databases (e.g., PostgreSQL, MySQL).
- **Transaction Management**: Configured transaction handling for database operations.
- **Security**: Integrated Spring Security with basic configurations for authentication and authorization.
- **Unit Testing**: JUnit and Mockito setup for writing and running unit tests.
- **Token Handling**: JWT-based token generation and validation.
- **Configuration Management**: Profiles for different environments (e.g., `dev`, `prod`) using `application.properties` or `application.yml`.
- **Exception Handling**: Centralized exception handling for REST APIs.
- **Logging**: Configured logging using SLF4J and Logback.

## Getting Started

### Prerequisites

- **Java 17** (or later)
- **Maven** (for building the project)
- **Docker** (optional, for running the database)

### Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd coreframework
   ```

1. **Start docker services**:
   ```bash
   docker-compose up -d
   ```
