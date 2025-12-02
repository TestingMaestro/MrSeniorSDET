package ex_25_OOPsConstructor;

public class Lab225PC {
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

        Car2 c3 = new Car2("Mercedes", "1979", "G Wagon");
        System.out.println(c3.name);
        System.out.println(c3.year);
        System.out.println(c3.model);
        c3.name = "Maybach";
        System.out.println(c3.name);
        System.out.println(c3.year);
        System.out.println(c3.model);

        Car2 c4 = c3;
        System.out.println(c4 == c3);

/*        System.out.println(" == will compare the object address");
        System.out.println(" .equal will compare the values");

        String name1 = "Yash";
        String name2 = new String("Yash");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));*/


    }

}

class Car2 {
    String name;
    String year;
    String model;

    Car2() {
        name = "Car";
        model = "XXXX";
        year = "2021";
    }

    Car2(String name, String year, String model) {
        this.name = name;
        this.year = year;
        this.model = model;
    }
}
