# Eureka Client Application

## Description

This project is a Eureka Client application built with Spring Boot and Spring Cloud. It is designed to register itself with a Eureka server for service discovery, enabling dynamic scaling and load balancing. Additionally, it incorporates the Spring Boot Admin server for easy monitoring and management of all registered services.

## Prerequisites

Before you can run this application, you need to have the following installed:

- Java JDK 11 or newer
- Maven 3.6.0 or newer
- An instance of Eureka Server running for service registration

## How to Run

1. Clone the repository to your local machine.
2. Open a terminal and navigate to the project directory.
3. Execute `mvn spring-boot:run` to start the application.

## Configuration

To configure the application to register with a specific Eureka server, modify the `application.properties` or `application.yml` file in the `src/main/resources` directory with the URL of your Eureka server.

Example `application.properties` configuration:

```properties
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/

API Endpoints

Create Customer

POST /customers
Creates a new customer record.
Update Customer

PUT /customers/{id}
Updates an existing customer's details.
Delete Customer

DELETE /customers/{id}
Deletes a customer record.
Get Customer

GET /customers/{id}
Retrieves a specific customer's details.
Error Handling
The application includes basic error handling for scenarios such as resource not found. It uses custom exceptions and ResponseEntityExceptionHandler to provide meaningful error messages to the client.
