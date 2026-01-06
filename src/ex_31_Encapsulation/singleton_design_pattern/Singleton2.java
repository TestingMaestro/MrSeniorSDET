package ex_31_Encapsulation.singleton_design_pattern;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            System.out.println("If there is no object created, create a new instance");
            instance = new Singleton2();
        } else System.out.println("Already object is created, return the instance of the object");
        return instance;
    }

    void showMessage() {
        System.out.println("Only one object is created throughout the lifecycle of the class");
    }
}
