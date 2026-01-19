package ex_41_exception_handling.using_throw;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Throw2
{
    static void urlMalformed() throws MalformedURLException
    {
        URL url = new URL("https://www.goole.com");
        throw new MalformedURLException("Exception Occurred"); // this is im telling JVM
    }
}
