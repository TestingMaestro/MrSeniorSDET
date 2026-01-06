package ex_31_Encapsulation.singleton_design_pattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("If there is not object --< create one");
            instance = new Singleton();
        } else System.out.println("use existing object and then return");
        return instance;
    }

    public void showMessage() {
        System.out.println("Only one Object - Singleton");
    }
}
