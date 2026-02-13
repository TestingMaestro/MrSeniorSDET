package A0_revision.E_exception_handling;

import java.util.InputMismatchException;

public class Exception5 {

    static void main() {

        try {
            try {
                int m = 1 / 0;
            } catch (NullPointerException e) {
                e.getMessage();
            }
            String m2 = null;
            System.out.println(m2.length());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
