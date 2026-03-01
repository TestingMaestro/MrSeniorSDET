package ex_28_method_overriding;

public class Laptop2 extends Laptop {
    String laptopName;
    String laptopModel;

    public Laptop2() {
        super("Yash");
    }

    void display() {
        //Overridden implementation
        System.out.println("Laptop Name: " + this.laptopName);
        System.out.println("Laptop Model: " + this.laptopModel);
    }
}
