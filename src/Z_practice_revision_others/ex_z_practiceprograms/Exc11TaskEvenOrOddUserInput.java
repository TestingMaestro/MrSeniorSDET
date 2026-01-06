package Z_practice_revision_others.ex_z_practiceprograms;

import java.util.Scanner;

public class Exc11TaskEvenOrOddUserInput {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            evenOdd(num);
        } else {
            System.out.println("Warning!! Enter valid number");
            System.exit(0);
        }

    }

    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");

    }
}
