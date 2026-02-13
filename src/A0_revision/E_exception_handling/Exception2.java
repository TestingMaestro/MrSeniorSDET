package A0_revision.E_exception_handling;

public class Exception2 {


    static void main(String[] args) {
        Exception2 ex = new Exception2();
        try{
        ex.myExceptionMethod();}
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    void myExceptionMethod(){

        String s1 = null;
        System.out.println(s1.length());
    }
}

