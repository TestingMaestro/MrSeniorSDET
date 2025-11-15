package ex_z_practiceprograms;

import java.util.Scanner;

public class Exc17PalindromeUsingOtherLogic {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String enteredString = sc.nextLine();
        String reversedString = stringReversed(enteredString);
        if (enteredString.equalsIgnoreCase(reversedString)) {
            System.out.println("Palindrome");
        } else System.out.println("Not a Palindrome");
        String reversedStringsb = stringReversedSb(enteredString);
        System.out.println(reversedStringsb);
    }

    private static String stringReversed(String enteredString) {
        String reversed = "";
        for (int i = 0; i < enteredString.length(); i++) {
            reversed = reversed + enteredString.charAt(enteredString.length() - i - 1);
        }
        return reversed;
    }

    private static String stringReversedSb(String enteredString) {

        StringBuilder stringBuilder = new StringBuilder(enteredString);
        return stringBuilder.reverse().toString();
    }


}
