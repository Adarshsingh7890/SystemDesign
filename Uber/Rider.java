package Uber;

import java.util.ArrayList;
import java.util.List;

public class Rider extends User {
    private List<Trip>triphistory = new ArrayList<>();

    public void setTriphistory(Trip trip){
        triphistory.add(trip);
    }

    public Rider(String id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }
}
