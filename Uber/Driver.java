package Uber;

import java.util.ArrayList;

public class Driver extends User{
    
    private String LiscenseNumber;
    private Vehicle vehicle;
    private boolean isAvailable;
    private ArrayList<Trip> triphistory = new ArrayList<>();

    public Driver(String id, String firstName, String lastName, String email, String password, String LiscenseNumber, Vehicle vehicle, boolean isAvailable) {
        super(id, firstName, lastName, email, password);
        this.LiscenseNumber = LiscenseNumber;
        this.vehicle = vehicle;
        this.isAvailable = isAvailable;
    }


    public String getLiscenseNumber() {
        return LiscenseNumber;
    }
    public void setLiscenseNumber(String liscenseNumber) {
        LiscenseNumber = liscenseNumber;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public ArrayList<Trip> getTriphistory() {
        return triphistory;
    }
    public void setTriphistory(Trip trip) {
        triphistory.add(trip);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((LiscenseNumber == null) ? 0 : LiscenseNumber.hashCode());
        result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
        result = prime * result + (isAvailable ? 1231 : 1237);
        result = prime * result + ((triphistory == null) ? 0 : triphistory.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Driver other = (Driver) obj;
        if (LiscenseNumber == null) {
            if (other.LiscenseNumber != null)
                return false;
        } else if (!LiscenseNumber.equals(other.LiscenseNumber))
            return false;
        if (vehicle == null) {
            if (other.vehicle != null)
                return false;
        } else if (!vehicle.equals(other.vehicle))
            return false;
        if (isAvailable != other.isAvailable)
            return false;
        if (triphistory == null) {
            if (other.triphistory != null)
                return false;
        } else if (!triphistory.equals(other.triphistory))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Rider [LiscenseNumber=" + LiscenseNumber + ", vehicle=" + vehicle + ", isAvailable=" + isAvailable
                + ", triphistory=" + triphistory + "]";
    }

    
}


