package ex_07_TernaryOperator;

public class Lab080EvenOdd {
    static void main(String[] args) {

        // Even or odd;

        int num = -1;

        String result = num > 0 ?(num % 2 == 0 ? "Even" : "Odd"): "Negative or NAN";
        System.out.println(result);
    }
}
