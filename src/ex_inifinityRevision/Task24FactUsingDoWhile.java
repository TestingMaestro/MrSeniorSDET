package ex_inifinityRevision;

public class Task24FactUsingDoWhile {
    static void main(String[] args) {

        int fact = factorialOfNumber(5);
        System.out.println(fact);
    }

    static int factorialOfNumber(int number) {
        int fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
        }
        while (i <= number);
        return fact;
    }
}
