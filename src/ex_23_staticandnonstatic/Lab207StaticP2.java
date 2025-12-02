package ex_23_staticandnonstatic;

public class Lab207StaticP2 {
    static void main(String[] args) {

        MyClass.sumOf2(); //or
        System.out.println(MyClass.m);
        System.out.println(MyClass.n);
    }
}

class MyClass {
    static int m = 10;
    static int n = 20;
    static int sum;

    static void sumOf2() {
        sum = m + n;
        System.out.println("Sum of " + m + " and " + n + " is " + sum);
    }
}
