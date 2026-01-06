package ex_29_polymorphism.runtimepolymorph;

public class Hp extends Shop {
    @Override
    void updateWindows() {
        System.out.println("Update windows on Hp");
    }
    @Override
    void service() {
        System.out.println("Service for HP");
    }
    @Override
    void laptops() {
        System.out.println("HP laptop");
    }
}
