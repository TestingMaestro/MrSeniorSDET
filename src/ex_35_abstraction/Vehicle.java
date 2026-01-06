package ex_35_abstraction;

abstract public class Vehicle {

    /**
     * An Abstract class can have Abstract/Concrete Methods
     * If a class have abstract methods that class should be mandatorily declared as Abstract [Otherwise Compilation - Error]
     * Abstract methods should be overridden in the subclass [To provide the implementation]
     * Abstract class can have only concrete methods - Allowed
     * Constructor is allowed in the abstract class
     * Constructor cannot be declared as abstract - it cannot be overridden/static
     * We cannot create object or instantiate abstract class
     */

    abstract void start();

    abstract void stop();

    void sound() {
        System.out.println("Vehicle Sound");
    }
}

