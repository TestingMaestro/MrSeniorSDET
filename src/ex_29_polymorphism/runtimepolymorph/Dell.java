package ex_29_polymorphism.runtimepolymorph;

public class Dell extends Shop {
    @Override
    void updateWindows() {
        System.out.println("Update windows on Dell");
    }
    @Override
    void service() {
        System.out.println("Service for Dell");
    }
    @Override
    void laptops() {
        System.out.println("Dell Laptop");
    }
}
