package Z_practice_revision_others.ex_inifinityRevision;

public class Task23FactUsingwhile {
    static void main(String[] args) {

        int fact = factorialOfNumber(5);
        System.out.println(fact);
    }

    static int factorialOfNumber(int number) {
        int fact = 1;
        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
