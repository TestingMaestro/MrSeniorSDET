package ex_18_Methods;

import java.util.Scanner;

public class Lab166Arithematic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter num a");
        if (sc.hasNextInt()) {
            num1 = sc.nextInt();

        } else {
            System.out.println("Enter valid Integer only");
            System.exit(0);
        }
        System.exit(0);

        System.out.println("Enter num b");
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();

        } else {
            System.out.println("Enter valid Integer only");
            System.exit(0);
        }


        int addition = add(num1, num2);
        int subtraction = sub(num2, num1);
        int multiplication = mul(num1, num2);
        int division = div(num1, num2);
        int modulo = modulo(num1, num2);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulo);


    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Number should not be divisible by zero");
            System.exit(0);
        } else return a / b;
        return 0;
    }

    static int modulo(int a, int b) {
        return a % b;
    }
}
