package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String licenseNumber;
    private List<Booking> bookingHistory;

    public Customer(int customerId, String name, String email, String phone, String licenseNumber) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
       this.bookingHistory = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public List<Booking> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<Booking> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

    // Method to add a booking to the booking history
    public void addBooking(Booking booking) {
        this.bookingHistory.add(booking);
    }
}
