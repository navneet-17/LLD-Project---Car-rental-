package services;

import factory.BookingFactory;
import models.*;
import strategies.PaymentStrategy;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class BookingService {
    private final List<Booking> bookings;

    public BookingService(List<Booking> bookings) {
        this.bookings = bookings;
    }

    // Method to check if a car is available for a specified date range
    public boolean isCarAvailableForDates(Car car, LocalDateTime startDate, LocalDateTime endDate) {
        // Check bookings related to this car and see if any overlap with the requested dates
        return bookings.stream()
                .filter(booking -> booking.getCar().equals(car))
                .noneMatch(booking -> booking.overlapsWith(startDate, endDate));
    }

    public Booking createBooking(Customer customer, Car car, LocalDateTime startDate, LocalDateTime endDate) {
        if (isCarAvailableForDates(car, startDate, endDate)) {  // Delegate availability check
            Booking booking = BookingFactory.createBooking(customer, car, startDate, endDate);
            bookings.add(booking);  // Add the new booking to the list of bookings
            System.out.println("Booking created successfully with ID: " + booking.getBookingId());
            return booking;
        } else {
            System.out.println("Car is not available for the requested dates.");
            return null;
        }
    }

    public boolean processPayment(Booking booking, PaymentStrategy paymentStrategy) {
        boolean success = paymentStrategy.pay(booking.getRentalAgreement().getTotalCost());
        System.out.println("Payment processed successfully for booking ID: "
                + booking.getBookingId());
        return success;
    }
}
