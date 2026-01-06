package ex_35_abstraction;

abstract public class Animal {
    abstract void sound();

    abstract void sleep();

    abstract void eat();
}

abstract class Peacock extends Animal {
    void sound() {
        System.out.println("Peacock Sound - moww");
    }

    void sleep() {
        System.out.println("Peacock is sleeping");
    }
}

class Peacock1 extends Peacock {

    void eat() {
        System.out.println("Peacock 1 is eating");
    }
}
