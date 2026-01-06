package ex_37_allOOPS_in_one;

public class RideBookingApp {
    static void main(String[] args) {

        VehicleRules ride;

        // Bike Booking and Fare

        ride = new Bike("Md sajid", "KA51MG7878");
        drive(ride, 20);
        ride = new Auto("Nancy", "KA05HT8787");
        drive(ride, 30);
        ride = new Car("Lucas", "KA01HT8187");
        drive(ride, 100);


    }

    private static void drive(VehicleRules ride, int km) {

        if (ride != null) {
            System.out.println("Vehicle No: " + ride.getVehicleNumber());
            System.out.println("Fare: ₹: " + ride.calculateFare(km));
        }

    }

}
