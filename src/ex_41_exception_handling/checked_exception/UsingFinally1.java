package ex_41_exception_handling.checked_exception;

public class UsingFinally1 {
    static void main(String[] args) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed if exception occurs or not");
        }

    }
}
