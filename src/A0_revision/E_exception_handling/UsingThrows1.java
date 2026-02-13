package A0_revision.E_exception_handling;

public class UsingThrows1 {

    static void main(String[] args)  {

        try {
            test();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void test() throws ArithmeticException{

        try {
            int i = 1/0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("/ zero is not allowed");
        }
    }
}
