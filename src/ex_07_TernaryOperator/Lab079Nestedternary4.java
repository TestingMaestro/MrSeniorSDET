package ex_07_TernaryOperator;

public class Lab079Nestedternary4 {
    static void main(String[] args) {
        // Find a Maximum number
        int a = 20;
        int b = 90;

        int result = Math.max(a, b);
        System.out.println(result);

        // using ternary operator

        String result1 = a > b ? "A is greater" : "B is greater";
        int result2 = a > b ? a : b;
        System.out.println(result1);
        System.out.println(result2);
    }
}
