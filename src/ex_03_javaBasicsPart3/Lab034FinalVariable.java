package ex_03_javaBasicsPart3;

public class Lab034FinalVariable {
    static final double PI = Math.PI;
    static int r = 2;

    static void main(String[] args) {

        double areaOfCircle = PI * r * r;
        System.out.println(String.format("Area of Circle is %.1f", areaOfCircle));
    }
}
