package ex_z_practiceprograms;

public class Exc9AreaOfCircle {
    static final double PI = 3.1415;
    static int radius;

    static void main(String[] args) {
        double area1 = areaOfCircle1(5);
        System.out.println(String.format("%.2f", area1));

        double area2 = areaOfCircle1(2);
        System.out.println(String.format("%.2f", area2));
    }

    static double areaOfCircle1(int radius) {
        return PI * radius * radius;
    }

    static double areaOfCircle2(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
