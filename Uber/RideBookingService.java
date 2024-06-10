package Uber;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.UUID;

public class RideBookingService {
    HashMap<Rider,Driver>RiderDriverMapping = new HashMap<>();
    HashMap<String,Driver>AvailableDriver = new HashMap<>();

    public RideBookingService(){
        AvailableDriver = new HashMap<>();
        RiderDriverMapping = new HashMap<>();
    }

    public void addDriver(Driver driver){
        AvailableDriver.put(driver.getId(),driver);
        System.out.println("Driver" + AvailableDriver.get(driver.getId()).isAvailable());
    }

    public Trip requestRide (Rider rider, Location startLocation, Location finalLocation) throws NoAvailableDriverException{
        Driver driver = findAvailableDriver(startLocation);

        if (driver == null){
            throw new NoAvailableDriverException("No Drivers Available at this moment");
        }

        Trip trip = new Trip(UUID.randomUUID(), driver, rider, startLocation, finalLocation, LocalTime.now(), Status.REQUESTED, CalculateFare(startLocation,finalLocation) );
        
        RiderDriverMapping.put(rider,driver);
        rider.setTriphistory(trip);
        driver.setAvailable(false);
        driver.setTriphistory(trip);
        trip.setStatus(Status.IN_PROGRESS);

        return trip;
    }


    public Driver findAvailableDriver(Location startLocation){
        for (Driver driver: AvailableDriver.values()){
            if (driver.isAvailable()){
                return driver;
            }
        }
        return null;
    }

    public Integer CalculateFare(Location startLocation, Location finalLocation){
        return (int) (Math.random()*100);
    }
    public void completeTrip(Trip trip) {
        trip.setStatus(Status.COMPLETED);
        trip.getDriver().setAvailable(true);
    }
}


