package ex_16_whileloop;

public class Lab154FactorialUsingWhileLoop5 {
    static void main(String[] args) {
        int i = 1;
        int fact = 1;
        while (i <= 5) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}
