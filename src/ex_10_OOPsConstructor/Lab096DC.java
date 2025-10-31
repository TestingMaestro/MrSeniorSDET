package ex_10_OOPsConstructor;

public class Lab096DC
{
    static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println("****************************");

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);
    }

}
class Car
{
    String name;
    String model;
    int year;

    Car()
    {
        name = "Mercedes";
        model = "G Wagon";
        year = 2025;
    }
}