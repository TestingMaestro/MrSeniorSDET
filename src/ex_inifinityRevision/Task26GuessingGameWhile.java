package ex_inifinityRevision;

import java.util.Random;
import java.util.Scanner;

public class Task26GuessingGameWhile {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Random number");
        Random random = new Random();
        int randomNo = random.nextInt(10) + 1;

        int numberToGuess;
        int attempts = 0;

        while (true) {
            numberToGuess = sc.nextInt();
            attempts++;
            if (numberToGuess < randomNo)
                System.out.println("Guessed Number is too low!!");
            else if (numberToGuess > randomNo)
                System.out.println("Guessed Number is too High!!");
            else {
                System.out.println("You guessed the number in " + attempts + " attempts");
                break;
            }


        }

    }
}
