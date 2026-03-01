package A0_revision.ObjectOrientedProgramming.Encapsulation;

public class SingletonDesignPattern {

    static SingletonDesignPattern singleton;

    private SingletonDesignPattern() {

    }

    public static SingletonDesignPattern show() {

        if (singleton == null) {
            System.out.println("Create object");
            singleton = new SingletonDesignPattern();
        }
        return singleton;

    }

    void displayMessage() {
        System.out.println("Singleton");
    }
}

class MainClass {
    public static void main(String[] args) {

        SingletonDesignPattern s1 = SingletonDesignPattern.show();
        SingletonDesignPattern s2 = SingletonDesignPattern.show();
        s1.displayMessage();
        s2.displayMessage();

    }
}




