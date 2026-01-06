package ex_29_polymorphism.runtimepolymorph;

public class Lenovo extends Shop{
    @Override
    void updateWindows() {
        System.out.println("Update windows on Lenovo");
    }
    @Override
    void service() {
        System.out.println("Service for Lenovo");
    }
    @Override
    void laptops() {
        System.out.println("Dell Lenovo");
    }
}
