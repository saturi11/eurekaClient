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

## API Endpoints

### Create Customer
**POST /customers**
- Creates a new customer record.

### Update Customer
**PUT /customers/{id}**
- Updates an existing customer's details.

### Delete Customer
**DELETE /customers/{id}**
- Deletes a customer record.

### Get Customer
**GET /customers/{id}**
- Retrieves a specific customer's details.

## Error Handling

The application includes basic error handling for scenarios such as resource not found. It uses custom exceptions and `ResponseEntityExceptionHandler` to provide meaningful error messages to the client.

## Related Projects

This project is part of a larger system. Here are the links to other related projects with a brief explanation of each:

1. **[Eureka Server](https://github.com/saturi11/eurekaserver)**
   - This is the Eureka Server where all services register for service discovery.

2. **[Eureka Delivery Service](https://github.com/saturi11/eurekaDelivery)**
   - This service handles the delivery logistics and integrates with the Eureka server for service discovery.

3. **[Order Eureka Client Service](https://github.com/saturi11/Order-Eureka-Client-Service)**
   - This service manages orders and also registers with the Eureka server for service discovery and load balancing.

Feel free to explore these repositories to understand the complete system architecture and how each service interacts with the Eureka server.
