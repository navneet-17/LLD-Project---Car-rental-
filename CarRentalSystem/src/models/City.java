package models;

import java.util.List;

import java.util.List;

public class City {
    private int cityId;
    private String cityName;
    private List<Integer> locationIds; // List of location IDs within the city

    public City(String cityName, int cityId, List<Integer> locationIds) {
        this.cityName = cityName;
        this.cityId = cityId;
        this.locationIds = locationIds;
    }

    // Getters and setters (if needed)
    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public List<Integer> getLocationIds() {
        return locationIds;
    }
}

