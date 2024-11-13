package factory;

import models.Booking;
import models.Car;
import models.Customer;
import models.RentalAgreement;

import java.time.LocalDateTime;
import java.util.UUID;

public class BookingFactory {
    public static Booking createBooking(Customer customer, Car car, LocalDateTime startDate, LocalDateTime endDate) {
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(bookingId, customer, car, startDate, endDate);

        // Create RentalAgreement and associate with Booking
        RentalAgreement rentalAgreement = new RentalAgreement(booking);
        booking.setRentalAgreement(rentalAgreement);

        return booking;
    }
}
