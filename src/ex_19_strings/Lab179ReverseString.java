package ex_19_strings;

import java.util.Scanner;

public class Lab179ReverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String userInput = sc.nextLine();
        stringReverse(userInput);
        stringReverse(userInput, 0);
    }

    static void stringReverse(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(userInput.charAt(userInput.length() - i - 1));
        }
        System.out.println();
    }

    static void stringReverse(String userInput, int r) {
        for (int i = userInput.length() - 1; i >= 0; i--) {
            System.out.print(userInput.charAt(i));
        }

    }
}
