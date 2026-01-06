package ex_35_abstraction;

public class Car extends Vehicle {
    void start() {
        System.out.println("Car Ignition On");
    }

    void stop() {
        System.out.println("Car Stops");
    }

    void sound() {
        System.out.println("Car Sound");
    }

    void drive() {
        start();
        stop();
        sound();
    }
}
