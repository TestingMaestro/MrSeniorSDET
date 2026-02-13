package A0_revision.E_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");

            int num = sc.nextInt();
            int m = 1 / num;
            System.out.println(m);
        }
        catch (ArithmeticException | InputMismatchException e1){
            System.out.println(e1.getMessage());
        }
    }
}
