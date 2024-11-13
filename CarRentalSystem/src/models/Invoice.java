package models;

import java.util.List;

public class Invoice {
    private final String invoiceId;
    private final Booking bookingDetails;
    private final List<Payment> payments;  // List of payments associated with this invoice
    private final double baseAmount;
    private final double additionalCharges;
    private final double totalAmount;
    private final double amountPaid;
    private final double balanceDue;

    public Invoice(String invoiceId, Booking bookingDetails, List<Payment> payments, double baseAmount, double additionalCharges, double totalAmount, double amountPaid, double balanceDue) {
        this.invoiceId = invoiceId;
        this.bookingDetails = bookingDetails;
        this.payments = payments;
        this.baseAmount = baseAmount;
        this.additionalCharges = additionalCharges;
        this.totalAmount = totalAmount;
        this.amountPaid = amountPaid;
        this.balanceDue = balanceDue;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public Booking getBookingDetails() {
        return bookingDetails;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public double getAdditionalCharges() {
        return additionalCharges;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double getBalanceDue() {
        return balanceDue;
    }
}
