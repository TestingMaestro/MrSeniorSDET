package A0_revision.E_exception_handling;

public class Exception1 {

    static void main(String[] args) {

        // an event that disrupts normal flow of the program is exception handling that exception handling
        try {
            int i = 1/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
