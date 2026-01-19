package ex_41_exception_handling.unchecked_exception;

public class Lab265Exception3 {
    static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
            try {
                int i = 1 / 0;
                System.out.println(i);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
