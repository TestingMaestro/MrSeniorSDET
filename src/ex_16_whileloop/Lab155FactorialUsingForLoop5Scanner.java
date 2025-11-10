package ex_16_whileloop;

import java.util.Scanner;

public class Lab155FactorialUsingForLoop5Scanner {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number while fact you want");
        int num = sc.nextInt();
        int fact = 1;
        if (num <= 0)
            System.out.println(fact);
        else {
            for (int i = num; i >= 1; i--) {
                fact = fact * i;
                System.out.print(" X " + i);
            }
            System.out.println(" = " + fact);
        }
    }
}
