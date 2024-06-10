package Uber;

public class Location {
    private Integer latitude;
    private Integer Longitude;
    public Integer getLongitude() {
        return Longitude;
    }
    public void setLongitude(Integer longitude) {
        Longitude = longitude;
    }
    public Integer getLatitude() {
        return latitude;
    }
    public Location(Integer latitude, Integer longitude) {
        this.latitude = latitude;
        Longitude = longitude;
    }
    

    
}
