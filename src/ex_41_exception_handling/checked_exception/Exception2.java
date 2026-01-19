package ex_41_exception_handling.checked_exception;

public class Exception2
{
    static void main() {

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
