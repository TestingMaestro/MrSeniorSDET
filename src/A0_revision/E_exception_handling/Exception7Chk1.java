package A0_revision.E_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception7Chk1 {
    static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C//yash.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
