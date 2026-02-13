package A0_revision.E_exception_handling;

public class Exception8Chk2 {

    static void main() {
        try{
            Thread.sleep(20);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
