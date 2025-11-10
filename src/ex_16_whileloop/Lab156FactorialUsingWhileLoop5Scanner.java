package ex_16_whileloop;

import java.util.Scanner;

public class Lab156FactorialUsingWhileLoop5Scanner {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of factorial which you need");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            int i = 1;
            int fact = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println(fact);
        } else System.out.println("Enter valid number");


    }
}
