import Observer.EmailNotification;
import Observer.SMSNotification;
import factory.BookingFactory;
import models.*;
import services.BookingService;
import services.NotificationService;
import strategies.CreditCardPayment;
import strategies.PaymentStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CarRentalSystemDemo {
    public static void main(String[] args) {
        // Setup initial data

        // Create City instance (with a list of location IDs if needed)
        List<Integer> locationIds = new ArrayList<>();
        City city = new City("CityName", 1, locationIds);

        // Create Location instance using cityId instead of the entire City object
        Location location = new Location(1, "12345", "LocationName", city.getCityId());

        // Optionally add locationId to city’s list
        locationIds.add(location.getLocationId());

        // Create Car instance using the Location object
        Car car = new Car(1, "Toyota", "Camry", "ABC123", 50.0, true, location);

        //create customer instance
        Customer customer = new Customer(1, "John Doe", "john@example.com", "+123456789", "DL123456");

        // Initialize services
        List<Booking> bookings = new ArrayList<>();
        BookingService bookingService = new BookingService(bookings);

        // Initialize Notification Service and add observers
        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(new EmailNotification("user@example.com"));
        notificationService.addObserver(new SMSNotification("+123456789"));

        // Set up booking dates
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = startDate.plusDays(3);

        // Create the booking
        Booking booking = BookingFactory.createBooking(customer, car, startDate, endDate);

        // Add the booking to the customer's booking history
        customer.addBooking(booking);

        // Process payment
        PaymentStrategy paymentStrategy = new CreditCardPayment();
        boolean paymentSuccess = bookingService.processPayment(booking, paymentStrategy);

        if (paymentSuccess) {
            System.out.println("Payment successful for booking ID: " + booking.getBookingId());
            // Notify observers upon successful booking
            notificationService.notifyObservers("Booking confirmed for car: " + car.getMake() + " " + car.getModel());

            // Add reminder notifications for the return date
            LocalDateTime reminderDate = endDate.minusHours(1); // Reminder 1 hour before end date
            System.out.println("Return reminder set for: " + reminderDate);
            notificationService.notifyObservers("Reminder: Your rental for " + car.getMake() + " " + car.getModel() + " is due at " + endDate);

        } else {
            System.out.println("Payment failed for booking ID: " + booking.getBookingId());
            notificationService.notifyObservers("Payment failed for booking of car: " + car.getMake() + " " + car.getModel());
        }
    }
}