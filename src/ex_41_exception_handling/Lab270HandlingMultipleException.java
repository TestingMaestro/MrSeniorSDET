package ex_41_exception_handling;

public class Lab270HandlingMultipleException {
    static void main(String[] args) {

        try {
            String name = null;
            System.out.println(name.trim());
            int a = 2 / 0;
            System.out.println(a);
            int b = Integer.parseInt("yash");
            System.out.println(b);
        } catch (NullPointerException | ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
