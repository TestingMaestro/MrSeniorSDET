package ex_z_practiceprograms.ex_OOps;

public class Exc25CreateClass {
    static void main(String[] args) {

    }
}

class Person {
    String name;
    byte age;
    String eyesColor;
    byte legs;
    String phoneNumber;
    double salary;
    byte noOfEyes;
    boolean iMale;
    boolean isMarried;
    String privatePartCalled;
    String skinColor;

    String greetWithName(String name) {
        return "Hello " + name;
    }

    double salary(double salary, int incomeTax) {
        return salary - incomeTax;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void bikeRide(boolean isMarried) {
        if (isMarried) {
            System.out.println(name + " can go for longer rides");
        } else System.out.println("Shorter Rides");
    }

}
