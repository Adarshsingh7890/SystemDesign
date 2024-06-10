package Uber;

public class UberApp {
    public static void main(String[] args) {
        RideBookingService rideBookingService = new RideBookingService();
        PaymentGateway paymentGateway = new PaymentGateway();

        Rider rider = new Rider("1", "John","Doe", "john@example.com", "1234567890");
        Driver driver = new Driver("2", "Jane", "Smith", "jane@example.com", "0987654321", "D123456", new Vehicle("V1", "ABC123", "Toyota Prius", "Black"), true);
        Location pickupLocation = new Location(37, -122); // San Francisco
        Location dropLocation = new Location(34, -118); // Los Angeles
        System.out.println(driver.isAvailable());// its printing false
        rideBookingService.addDriver(driver);

        try{
            Trip trip = rideBookingService.requestRide(rider, pickupLocation, dropLocation);
            paymentGateway.processPayment(trip, PaymentMethod.CREDIT_CARD);
            rideBookingService.completeTrip(trip);
            System.out.println("Trip Completed. Thanks for travelling with us!!");
        }catch(NoAvailableDriverException e){
            System.out.println(e.getMessage());
        }
    }
}
