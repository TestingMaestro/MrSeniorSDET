package ex_41_exception_handling.checked_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab268CheckedException {
    static void main() {

        try {
            FileInputStream f1 = new FileInputStream("C://data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
