package ex_11_MethodsOrFunctions;

public class Lab103AreaOfCircle {
    static final double PI = 3.142;
    static int rad = 4;

    static void main(String[] args) {
        area();
        areaUsingMathFunction();
    }

    static void area() {
        double areaOfCircle = PI * rad * rad;
        System.out.println(String.format("%.2f", areaOfCircle));
    }

    static void areaUsingMathFunction() {
        double areaOfCircle = Math.PI * Math.pow(rad, 2);
        System.out.println(String.format("%.2f", areaOfCircle));
    }


}
