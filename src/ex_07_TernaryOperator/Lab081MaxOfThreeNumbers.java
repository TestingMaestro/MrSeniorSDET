package ex_07_TernaryOperator;

public class Lab081MaxOfThreeNumbers {
    static void main(String[] args) {

        // Find Maximum of three
        int a = 110, b = 20, c = 0;

        String result = (a >= 0 && b >= 0 && c >= 0) ? (a > b && a > c) ? "a is greater" : ((b > c) ? "b is greater" : "c is greater") : "Invalid";

        System.out.println(result);
    }
}
