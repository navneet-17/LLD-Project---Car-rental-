package services;

import models.Booking;
import models.RentalAgreement;

import java.time.LocalDateTime;

public class CarReturnService {
    public double finalizeCarReturn(Booking booking, LocalDateTime actualReturnDate) {
        booking.setActualReturnDate(actualReturnDate);
        RentalAgreement rentalAgreement = booking.getRentalAgreement();
        rentalAgreement.finalizeRentalAgreement(actualReturnDate);
        return rentalAgreement.getTotalCost(); // Return the total cost with any penalties
    }
}
