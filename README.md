# Bookstore Backend

A Spring Boot REST backend for a simple eCommerce bookstore. The project demonstrates a practical backend flow for browsing books, managing a cart, and creating orders.

## Technology
- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 for local development
- Maven
- JUnit / MockMvc

## API
- `GET /api/books` - list books
- `GET /api/books/{id}` - get a book
- `POST /api/books` - add a book
- `POST /api/orders` - create an order
- `GET /api/orders/{id}` - get an order

## Development approach

The implementation was developed iteratively with an agentic coding workflow: requirements were broken into small backend tasks, generated suggestions were reviewed, the implementation was adjusted where needed, and the APIs were validated with tests.

The important engineering step was not accepting generated code blindly. Design decisions, validation, error handling, API behaviour, and test results were reviewed before considering a task complete.

## Run locally

```bash
mvn spring-boot:run
```

The application starts on port 8080.

## Example

```bash
curl http://localhost:8080/api/books
```

> This repository is a learning/capstone demonstration. Replace any project-specific claims with the exact work performed before using it as evidence for a formal assessment.
