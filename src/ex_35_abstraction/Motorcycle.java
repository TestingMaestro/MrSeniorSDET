package ex_35_abstraction;

class Motorcycle extends Vehicle {
    String name;
    void start() {
        System.out.println("Bike Ignition On");
    }

    void stop() {
        System.out.println("Bike Stops");
    }

    void sound() {
        System.out.println("Bike Sound");
    }
    public String toString(String name)
    {
        return name;
    }
}
