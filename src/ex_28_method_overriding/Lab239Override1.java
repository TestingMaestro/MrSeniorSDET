package ex_28_method_overriding;

public class Lab239Override1 {
    static void main(String[] args) {
        Laptop2 l2 = new Laptop2();
        Laptop2 l3 = new Laptop2();
        System.out.println(l2.name);
        l2.display();
    }
}
