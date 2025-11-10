package ex_13_conditions;

import java.util.Scanner;

public class Lab119IfElseUserInput {
    static void main(String[] args) {

        // Taking USer input from Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            voteEligibilty(age);
        } else {
            System.out.println("Enter the valid integer for age");
            System.exit(0);
        }
    }

    static void voteEligibilty(int age) {
        if (age != 0 && age >= 18) {
            System.out.println("Allowed to vote");
        } else {
            System.out.println("not allowed to vote");
        }
    }
}
