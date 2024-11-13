package models;

public class Car {

    private int carId;
    private String make;
    private String model;
    private String licensePlate;
    private double hourlyRate;
    private boolean available;
    private Location location;

    public Car(int carId, String make, String model, String licensePlate, double hourlyRate, boolean available, Location location) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.hourlyRate = hourlyRate;
        this.available = available;
        this.location = location;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
