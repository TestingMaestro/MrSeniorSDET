package A0_revision.E_exception_handling;

public class Exception6 {

    static void main(String[] args) {

        try {
            int i = Integer.parseInt("Yash");
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}
