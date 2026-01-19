package ex_41_exception_handling.checked_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {
    static void main(String[] args) {

        try {
            FileInputStream fi = new FileInputStream("C:\\Filename.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
