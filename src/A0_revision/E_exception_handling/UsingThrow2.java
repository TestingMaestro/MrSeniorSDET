package A0_revision.E_exception_handling;

import java.util.Scanner;

public class UsingThrow2 {

    static void main() {
        try {
            ExceptionThrown.ageMissMatch();
        } catch (Exception w) {
            System.out.println(w.getMessage());
        }
    }

}

class ExceptionThrown {

    static void ageMissMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age < 18) {
            throw new RuntimeException("Invalid Age");
        } else System.out.println("Allowed to vote");
    }
}