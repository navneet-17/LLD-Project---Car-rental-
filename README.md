# Car Rental System

## Overview
This is a Java-based Car Rental System that lets users book cars, make payments, and receive notifications. The system covers everything needed for car rentals, like managing cars, customers, bookings, and payments. I've used object-oriented design and some key design patterns to keep it organized and flexible for future updates.

## Main Features

### Car Management
* Manage different cars with details like make, model, license plate, rental rate, and availability.
* Cars are connected to specific locations and cities, making it easy to find available cars.

### Customer Management

* Allows customer registration with details like name, email, phone, and driver’s license number.
* Keeps a record of all bookings each customer has made.

### Booking System

* Users can search for available cars by make, model, city, and dates.
* Handles car reservations and makes sure cars aren’t double-booked by checking availability for each request.

### Rental Agreement

* Creates a rental agreement for each booking, showing rental costs, terms, and any penalties for late returns.
* Tracks the rental status (like active or completed) and calculates the total rental cost.

### Payment Processing

* Supports different payment methods (like credit card and UPI) using the Strategy Pattern.
* Saves each payment and links it to the correct booking.
* 
### Notifications

* Sends notifications to customers for booking confirmations, cancellations, and return reminders.
* Uses the Observer Pattern to handle notifications, so it's easy to add new types if needed.

### Invoice

* Generates an invoice for each booking, which includes rental cost, additional charges, payments made, and any balance due.
