package ex_07_TernaryOperator;

public class Lab082MinOfThreeNumbers {
    static void main(String[] args) {

        // Find Maximum of three
        int a = 110, b = 20, c = 0;

        int result = (a >= 0 && b >= 0 && c >= 0) ? (a < b && a < c) ? a : ((b < c) ? b : c) : a;

        System.out.println("Minimum is " + result);
    }
}
