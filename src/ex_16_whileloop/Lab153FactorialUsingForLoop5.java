package ex_16_whileloop;

public class Lab153FactorialUsingForLoop5 {

    static void main(String[] args) {

        int fact = 1;
        for (int i = 5; i >= 1; i--) {
            fact = fact * i;
            System.out.print(" X " + i);
        }
        System.out.println(" = " + fact);
    }
}
