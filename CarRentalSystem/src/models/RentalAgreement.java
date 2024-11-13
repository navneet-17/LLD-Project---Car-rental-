package models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RentalAgreement {
    private final Booking booking;
    private double rentalCost;
    private double latePenalty;

    public RentalAgreement(Booking booking) {
        this.booking = booking;
        calculateInitialRentalCost();
    }

    // Initial rental cost calculation (only for the booked hours)
    private void calculateInitialRentalCost() {
        long hoursRented = ChronoUnit.HOURS.between(booking.getStartDate(), booking.getEndDate());
        rentalCost = booking.getCar().getHourlyRate() * Math.max(hoursRented, 4); // minimum 4 hours
    }

    // This method is called when the car is returned
    public void finalizeRentalAgreement(LocalDateTime actualReturnDate) {
        calculateLatePenalty(actualReturnDate);
    }

    // Calculate late penalty only if the car is returned after the agreed end date
    private void calculateLatePenalty(LocalDateTime actualReturnDate) {
        if (actualReturnDate.isAfter(booking.getEndDate())) {
            long additionalHours = ChronoUnit.HOURS.between(booking.getEndDate(), actualReturnDate);
            latePenalty = additionalHours * booking.getCar().getHourlyRate() * 0.10;
        } else {
            latePenalty = 0;
        }
    }

    public double getTotalCost() {
        return rentalCost + latePenalty;
    }
}



