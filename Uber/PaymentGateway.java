package Uber;

public class PaymentGateway {
    public void processPayment(Trip trip, PaymentMethod paymentMethod){
        System.out.println("Processing payment for trip " + trip.getId());
    }
}


