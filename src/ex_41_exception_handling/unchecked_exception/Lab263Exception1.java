package ex_41_exception_handling.unchecked_exception;

public class Lab263Exception1 {
    static void main(String[] args) {

        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed");
        }

    }
}
