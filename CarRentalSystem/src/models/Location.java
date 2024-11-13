package models;

public class Location {
    private int locationId;
    private String pincode;
    private String locationName;
    private int cityId; // Associated city

    public Location(int locationId, String pincode, String locationName, int cityId) {
        this.locationId = locationId;
        this.pincode = pincode;
        this.locationName = locationName;
        this.cityId = cityId;
    }

    // Getters and setters (if needed)
    public int getLocationId() {
        return locationId;
    }

    public String getPincode() {
        return pincode;
    }

    public String getLocationName() {
        return locationName;
    }

    public int getCityId() {
        return cityId;
    }
}
