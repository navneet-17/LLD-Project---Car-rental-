package services;

import models.Car;
import models.City;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> carInventory;
    private final BookingService bookingService;

    public CarService(List<Car> carInventory, BookingService bookingService) {
        this.carInventory = carInventory;
        this.bookingService = bookingService;
    }

    public List<Car> searchCars(String make, String model, int cityId, String pincode, LocalDateTime startDate, LocalDateTime endDate) {
        return carInventory.stream()
                .filter(car -> car.isAvailable() && car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model))
                .filter(car -> car.getLocation().getCityId() == cityId && car.getLocation().getPincode().equals(pincode))
                .filter(car -> bookingService.isCarAvailableForDates(car, startDate, endDate))
                .collect(Collectors.toList());
    }

}

