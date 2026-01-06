package ex_29_polymorphism.runtimepolymorph;

public class Shop {
    void act() {
        laptops();
        service();
        updateWindows();

    }

    void updateWindows() {
        System.out.println("Update windows");
    }

    void service() {
        System.out.println("Service");
    }

    void laptops() {
        System.out.println("All Laptops");
    }

}
