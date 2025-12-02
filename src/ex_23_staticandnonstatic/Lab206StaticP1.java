package ex_23_staticandnonstatic;

public class Lab206StaticP1 {
    static int a = 10;

    static void main(String[] args) {
        method1();
    }

    static void method1() {
        System.out.println(a);
        System.out.println("Running Method 1");

    }
}
