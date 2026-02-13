package A0_revision.E_exception_handling;

import java.net.MalformedURLException;
import java.net.URL;

public class Exception9Chk3 {

    static void main() {
        try{
            URL url = new URL("www.g.com");
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }
}
