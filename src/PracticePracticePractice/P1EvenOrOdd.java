package PracticePracticePractice;

import java.util.Scanner;

public class P1EvenOrOdd {

    static void main(String[] args) {

        evenOrOdd();
    }

    static void evenOrOdd() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {

            if (i % 2 == 0) {
                System.out.print(" " + i);
            }

        }
        sc.close();
    }
}
