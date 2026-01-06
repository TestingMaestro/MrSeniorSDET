package ex_28_method_overriding;

public class Laptop {
    String laptopName;
    String laptopModel;
    String name;

    public Laptop() {
        this.laptopName = "Dell Lattitude XP12";
        this.laptopModel = "2018";
    }
    public Laptop(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Dell Latitude - No Touch display");
    }
}
