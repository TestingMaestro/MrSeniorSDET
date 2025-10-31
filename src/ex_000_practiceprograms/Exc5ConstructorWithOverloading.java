package ex_000_practiceprograms;

public class Exc5ConstructorWithOverloading {
    static void main(String[] args) {

        Person1 p1 = new Person1();
        Person1 p2 = new Person1("Yash", "30", "9248459157", true);
        Person1 p3 = new Person1("Minni", "27", "9248459155", true);
        Person1 p4 = new Person1("Chinna", "70", "9248459155", true);
        p2.printDetails();
        p3.printDetails();
        p4.printDetails();
    }
}

class Person1 {
    String name;
    String age;
    String phNo;
    boolean isMale;

    Person1() {
        System.out.println("Im a Default constructor");
        System.out.println();
    }


    Person1(String name, String age, String phNo, boolean isMale) {
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.isMale = isMale;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");

    }

    void walk() {
        System.out.println(this.name + " is walking");

    }

    void printDetails() {
        if (isMale) {
            System.out.println("Person name: " + this.name);
            System.out.println("Person age: " + this.age);
            System.out.println("Person Phone Number: " + this.phNo);
            System.out.println("Person name: " + this.isMale);
            eat();
            walk();
            sleep();
            System.out.println();
        } else
            System.out.println("He/She is a Trans");

    }
}
