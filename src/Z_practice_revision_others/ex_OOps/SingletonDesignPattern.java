package Z_practice_revision_others.ex_OOps;

public class SingletonDesignPattern {

    private static SingletonDesignPattern instance;

    private SingletonDesignPattern() {
    }

    public static SingletonDesignPattern getInstance() {
        if (instance == null) {
            instance = new SingletonDesignPattern();
        }else System.out.println("No new object created return the same instance");
        return instance;
    }

    void message() {
        System.out.println("Only one obj creation ");
    }
}

class MainClassz {

    static void main(String[] args) {

        SingletonDesignPattern obj1 = SingletonDesignPattern.getInstance();
        obj1.message();
        SingletonDesignPattern obj2 = SingletonDesignPattern.getInstance();
        obj2.message();

        System.out.println(obj1 == obj2);
    }
}
