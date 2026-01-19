package ex_41_exception_handling.checked_exception;

import java.io.FileInputStream;

public class UsingFinally2 {
    static void main(String[] args) throws Exception{

        try {
            FileInputStream fi = new FileInputStream("C://ht.txt");

        } finally {
            System.out.println("Exception occurs or not, I will be executed");
        }
    }
}
