package A0_revision.E_exception_handling;

public class Exception4 {

    static void main(String[] args) {

        try{
            String n = null;
            System.out.println(n.hashCode());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
