package ex_41_exception_handling.checked_exception;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Exception3
{
    static void main(String[] args) {

        try {
            URL url = new URL("https://www.google.com");
            url.getContent();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        catch (IOException i)
        {
            System.out.println(i.getMessage());
        }
    }
}
