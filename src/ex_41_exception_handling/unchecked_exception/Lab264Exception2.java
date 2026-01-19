package ex_41_exception_handling.unchecked_exception;

public class Lab264Exception2 {
    static void main(String[] args) {

        try {
            Integer i1 = null;
            System.out.println(i1.intValue());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        }


    }
}
