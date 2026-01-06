package ex_25_OOPsConstructor;

public class Lab231ConstructorOverloading {
    static final int a;
    final int m;

    static void main(String[] args) {
        ConstructorOverload co = new ConstructorOverload(true, 'A');
        final int c = 10;

    }

    static {
        a = 10;
    }

    {
        m = 90;
    }
}

class ConstructorOverload {

    ConstructorOverload() {
        System.out.println("Default constructor");
    }

    ConstructorOverload(String name, int age) {
        this();
        System.out.println("string and int");
    }

    ConstructorOverload(int age, String address) {
        this("Yashu", 30);
        System.out.println("double, int");
    }

    ConstructorOverload(double salary, int incomeTax) {
        this(20, "JP NAGAR");
        System.out.println("double, int");
    }

    ConstructorOverload(boolean isMarried, char grade) {
        this(300000, 'A');
        System.out.println("bool and char");
    }
}
