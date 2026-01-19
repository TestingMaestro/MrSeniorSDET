package ex_41_exception_handling;

import java.util.Scanner;

public class Lab271TryCatchFinally {
    static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        try {
            int b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }


    }
}
