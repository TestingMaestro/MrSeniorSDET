package ex_10_OOPsConstructor;

public class Lab099ThisCallingStatement {
    static void main(String[] args) {
        Sample s1 = new Sample("Yash");
    }

}

class Sample extends Lab099ThisCallingStatement {
    double a;
    int b;
    int c;

    Sample(int a) {
        System.out.println("one arg constructor");
    }

    Sample(double a, int c) {
        this(90);
        System.out.println("2 arg constructor");
    }

    Sample(String m) {
        this(20.22, 89);
        System.out.println("one arg constructor with different type");
    }

}