package Uber;

import java.time.LocalTime;
import java.util.UUID;

public class Trip {
    private UUID id;
    private Driver driver;
    private Rider rider;
    private Location startlocation;
    private Location finalLocation;
    private LocalTime Time;
    private Status status;
    private int Fare;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Rider getRider() {
        return rider;
    }
    public void setRider(Rider rider) {
        this.rider = rider;
    }
    public Location getStartlocation() {
        return startlocation;
    }
    public void setStartlocation(Location startlocation) {
        this.startlocation = startlocation;
    }
    public Location getFinalLocation() {
        return finalLocation;
    }
    public void setFinalLocation(Location finalLocation) {
        this.finalLocation = finalLocation;
    }
    public LocalTime getTime() {
        return Time;
    }
    public void setTime(LocalTime time) {
        Time = time;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public int getFare() {
        return Fare;
    }
    public void setFare(int fare) {
        Fare = fare;
    }
    public Trip(UUID uuid, Driver driver, Rider rider, Location startlocation, Location finalLocation,
            LocalTime localTime, Status status, int fare) {
        this.id = uuid;
        this.driver = driver;
        this.rider = rider;
        this.startlocation = startlocation;
        this.finalLocation = finalLocation;
        Time = localTime;
        this.status = status;
        Fare = fare;
    }
    
    
}
