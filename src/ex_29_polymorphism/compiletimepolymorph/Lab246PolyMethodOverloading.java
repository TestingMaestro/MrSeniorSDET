package ex_29_polymorphism.compiletimepolymorph;

public class Lab246PolyMethodOverloading {

    static void main(String[] args) {

        int r1 = MathOperations.add(2);
        int r2 = MathOperations.add(2, 3); //Binds early - during class load
        int r3 = MathOperations.add(2, 3, 4);
        double r4 = MathOperations.add(2.3, 4.5);
    }
}

