package ex_37_allOOPS_in_one;

public interface VehicleRules {
    void startRide();
    String getVehicleNumber();
    double calculateFare(int km);
}

abstract class Vehicle implements VehicleRules {
    private String driverName;
    private String vehicleNumber;

    Vehicle(String driverName, String vehicleNumber) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public void startRide() {
        System.out.println("Started Ride with: " + this.driverName);
    }
}

class Bike extends Vehicle {

    Bike(String bRiderName, String bVehicleNu) {
        super(bRiderName, bVehicleNu);
    }

    @Override
    public double calculateFare(int km) {
        return km * 10;
    }
}

class Auto extends Vehicle {
    Auto(String autoDriverName, String autoNumber) {
        super(autoDriverName, autoNumber);
    }

    @Override
    public double calculateFare(int km) {
        return km * 50;
    }
}

class Car extends Vehicle {
    Car(String carDriver, String carNumber) {
        super(carDriver, carNumber);
    }

    @Override
    public double calculateFare(int km) {
        return km * 100;
    }
}