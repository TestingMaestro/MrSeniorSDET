package A0_revision.E_exception_handling;

public class UsingThrow1 {

    static void main() {

        try {
            ex();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void ex(){
        try {
            int i = 1/0;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("/ zero is not allowed");
        }
    }
}
