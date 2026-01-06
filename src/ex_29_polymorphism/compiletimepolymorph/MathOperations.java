package ex_29_polymorphism.compiletimepolymorph;

public class MathOperations {
    static int add(int a) {
        return a + a;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
