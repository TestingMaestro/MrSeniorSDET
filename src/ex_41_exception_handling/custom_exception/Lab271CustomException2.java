package ex_41_exception_handling.custom_exception;

import java.util.Scanner;

public class Lab271CustomException2 {

    static void main(String[] args) {
        ValidateAge vage = new ValidateAge();
        try {
            vage.validateAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}

class ValidateAge {

    void validateAge() throws InvalidAgeException {
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if (age < 18) {
            throw new InvalidAgeException("Age is invalid to vote");
        }
    }

}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
