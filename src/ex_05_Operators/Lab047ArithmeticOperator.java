package ex_05_Operators;

public class Lab047ArithmeticOperator {
    static void main(String[] args) {
        // +. -, *, / %

        int a = 10;
        int b = 3;
        float c = 3.0f;
        double re = a / b;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(String.format("%.2f", (a/c)));
    }
}
