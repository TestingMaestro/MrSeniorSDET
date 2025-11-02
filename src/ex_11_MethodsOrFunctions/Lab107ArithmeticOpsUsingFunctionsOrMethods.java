package ex_11_MethodsOrFunctions;

import java.util.Scanner;

public class Lab107ArithmeticOpsUsingFunctionsOrMethods {
    static void main(String[] args) {
        /*
         * Create the Method for Add, Sub, Mult, Div, Modulus
         * with parameter a, b (Take the input from user)
         */

        /*
         * Logic Building formula
         * Step 1 --> Inputs and Outputs
         * a, b --> Input
         * int --> Output variable result
         *
         * Step 2 --> Rough Logic --> Create Functions
         * Function --> Type 4 --> with parameter and with return type
         *
         * Step 3 --> Edge cases -- Write the code and find and fix
         *
         * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num 1");
        int a = 0;
        int b = 0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();

        } else {
            System.out.println("Warning!! Num 1 should be integer");
            System.exit(0);
        }

        System.out.println("Enter the num 2");
        if (sc.hasNextInt()) {
            b = sc.nextInt();

        } else {
            System.out.println("Warning!! Num 2 should be integer");
            System.exit(0);
        }

        int addRes = add(a, b);
        int subRes = sub(a, b);
        int mulRes = mul(a, b);
        int divRes = div(a, b);
        int modRes = mod(a, b);

        System.out.println(addRes);
        System.out.println(subRes);
        System.out.println(mulRes);
        System.out.println(divRes);
        System.out.println(modRes);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Divide by zero is not allowed");
            System.exit(0);
        }
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
