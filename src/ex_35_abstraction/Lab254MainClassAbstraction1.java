package ex_35_abstraction;

public class Lab254MainClassAbstraction1
{
    static void main(String[] args) {

        Motorcycle m = new Motorcycle();
        m.start();
        m.sound();
        m.stop();

        Car c = new Car();
        c.start();
        c.sound();
        c.stop();
    }
}
