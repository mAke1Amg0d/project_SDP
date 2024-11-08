# Movie Ticket Booking System

This project is a **Movie Ticket Booking System** implemented in Java, demonstrating multiple software design patterns to organize functionality and improve maintainability. The system allows users to book movie tickets, manage notifications, and process payments through external services.

## Project Structure

- **Behavioral Patterns**: Includes `NotificationService`, `Notifier`, and `User` classes for user notifications.
- **Creational Patterns**: Implements `DatabaseConnection`, `TicketFactory`, and `StandardTicketFactory` for managing ticket creation and database access.
- **Structural Patterns**: Utilizes `BookingFacade`, `PaymentAdapter`, and `ExternalPaymentService` for simplifying the booking process and handling payments.

## Features

- **Ticket Booking**: Users can book tickets for movies.
- **Notification System**: Users receive notifications for successful bookings and other updates.
- **Payment Processing**: Payments are handled through an external service using an adapter pattern.

## Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/mAke1Amg0d/project_SDP.git
