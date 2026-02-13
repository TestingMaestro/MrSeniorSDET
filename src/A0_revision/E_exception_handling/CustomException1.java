package A0_revision.E_exception_handling;

import java.util.Scanner;

public class CustomException1 {

    static void main(String[] args) {

        try {
            myAgeValidationToVote();
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }

    }

    static void myAgeValidationToVote() throws AgeInvalidException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            if (sc.hasNextInt() && age < 18) {
                throw new AgeInvalidException("You age is below criteria to vote. Not Eligible");
            } else System.out.println("Voting Allowed");
        } else System.out.println("Enter valid integer");
    }
}

class AgeInvalidException extends Exception {

    String message;

    AgeInvalidException(String message) {
        super(message);
    }
}