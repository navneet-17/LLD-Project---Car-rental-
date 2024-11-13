package models;

import java.time.LocalDateTime;

public class Payment {
    private final String paymentId;
    private final double amountPaid;
    private final PaymentMethod paymentMethod;
    private final LocalDateTime paymentDate;
    private final PaymentStatus paymentStatus;

    public Payment(String paymentId, double amountPaid, PaymentMethod paymentMethod, LocalDateTime paymentDate, PaymentStatus paymentStatus) {
        this.paymentId = paymentId;
        this.amountPaid = amountPaid;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
