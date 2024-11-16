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

2. **Start docker services**:
   ```bash
   docker-compose up -d
   ```

3. **Stop docker services**:
   ```bash
   docker-compose down
   ```

3. **Stop docker services and removes the containers and the associated volumes**:
   ```bash
   docker-compose down -v
   ```

### Accessing Secured Endpoints

This project uses Spring Security with basic authentication
enabled by default. When accessing the API endpoints through
the browser, you will be prompted to log in with a username
and password.

1. **Default User Login:**

- The default username is user: admin
- The generated password can be found in the application
logs under the line: *Using generated security password: ######*

3. **Using curl for Secured API Calls:**

```bash
curl -u user:<password> http://localhost:8080/api/your-endpoint
```

4. **Custom Username and Password:**
You can set a custom username and password by updating the following 
properties in application.properties or application.yml:
```bash
spring.security.user.name=yourUsername
spring.security.user.password=yourPassword
```









