package ex_16_whileloop;

import java.util.Random;
import java.util.Scanner;

public class Lab157WhileGuessingGame {
    static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int guess;
        int attempts = 0;

        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too Low, try again!!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again!!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }

        }
    }
}
