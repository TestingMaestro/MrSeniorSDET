package ex_36_abstraction_using_interface;

class Car implements Brakes, Engine {

    @Override
    public void startEngine() {
        System.out.println("Start the car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the car");
    }

    @Override
    public void test() {
        System.out.println("Ride and Test teh car");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Apply car brakes");
    }
}
