package ex_36_abstraction_using_interface;

interface Brakes {

    void applyBrakes();
}

interface Engine {
    void startEngine();

    void stopEngine();

    default void test() {
        System.out.println("Concrete Complete");
    }
}

