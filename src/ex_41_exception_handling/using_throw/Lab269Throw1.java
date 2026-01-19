package ex_41_exception_handling.using_throw;

import java.net.MalformedURLException;

public class Lab269Throw1 {
    static void main(String[] args) {

        try {
            ExceptionOccurred.divide(1, 0);
            Throw2.urlMalformed();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

    }
}

class ExceptionOccurred {

    static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Exception occurred here");
        }
        System.out.println(a / b);
    }
}

