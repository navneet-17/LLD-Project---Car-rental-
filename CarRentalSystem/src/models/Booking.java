package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private final String bookingId;
    private final Customer customer;
    private final Car car;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private LocalDateTime actualReturnDate;  // Actual date when the car is returned
    private RentalAgreement rentalAgreement;
    private final List<Payment> payments;
    private Invoice invoice; // Invoice summary for this booking

    public Booking(String bookingId, Customer customer, Car car, LocalDateTime startDate, LocalDateTime endDate) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payments = new ArrayList<>();
    }

    // Setter for rental agreement
    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }



    // Method to check if the current booking overlaps with given start and end dates
    public boolean overlapsWith(LocalDateTime requestedStart, LocalDateTime requestedEnd) {
        return startDate.isBefore(requestedEnd) && endDate.isAfter(requestedStart);
    }

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public LocalDateTime getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(LocalDateTime actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
