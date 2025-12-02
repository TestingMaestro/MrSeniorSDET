package ex_25_OOPsConstructor;

public class Lab224 {
    static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);

        /*
         * If you see above when we use the DC,
         * The 2 objects which has created have the same default values
         * I u create another one, again same value
         * To Overcome this we will go to Parameterized Constructor*/

    }

}

class Car {
    String name;
    String year;
    String model;

    Car() {
        name = "Car";
        model = "XXXX";
        year = "2021";
    }
}
