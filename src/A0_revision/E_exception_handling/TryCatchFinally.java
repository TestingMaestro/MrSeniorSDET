package A0_revision.E_exception_handling;

public class TryCatchFinally {

    static void main(String[] args) {

        try {
            int i = 1 / 0;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Close the DB connection or any files");
        }
        System.out.println("Message");
    }
}
