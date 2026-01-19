package ex_41_exception_handling.unchecked_exception;

public class Lab266Exception4 {
    static void main(String[] args) {
        try {
            int a1 = Integer.parseInt("Yash");
            System.out.println(a1);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
