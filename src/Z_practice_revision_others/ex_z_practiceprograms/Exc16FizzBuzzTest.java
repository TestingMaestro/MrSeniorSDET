package Z_practice_revision_others.ex_z_practiceprograms;

import java.util.Scanner;

public class Exc16FizzBuzzTest {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0)
                System.out.println(i + " --> Fizz");
            else if (i % 5 == 0)
                System.out.println(i + " --> Buzz");
            else System.out.println(i + " --> FizzBuzz");
        }
    }
}
