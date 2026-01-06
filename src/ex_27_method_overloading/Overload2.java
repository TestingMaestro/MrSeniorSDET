package ex_27_method_overloading;

public class Overload2 {
    static final double PI = 3.142;

    static void main(String[] args) {

        area(2, 5);
        area(5);
        area(6);
        area(4.2f, 6);
        area(2.89f);
        area(2, 3, 9);


    }

    static void area(int l, int b) {
        int area = l * b;
        System.out.println("Area of Rectangle " + area);
    }

    static void area(int side) {
        double area = Math.pow(side, 2);
        System.out.println("Area of Square " + area);
    }

    static void area(float base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle " + String.format("%.2f", area));
    }

    static void area(float radius) {
        double area = PI * Math.pow(radius, 2);
        System.out.println("Area of Circle " + String.format("%.2f", area));
    }

    static void area(int side1, int side2, int height) {
        double area = 0.5 * (side1 + side2) * height;
        System.out.println("Area of Trapezium (Trapezoid) " + area);

    }
}