package Z_practice_revision_others.ex_inifinityRevision;

public class Task22FactUsingFor {
    static void main(String[] args) {

        int fact = factorialOfNumber(5);
        System.out.println(fact);
    }

    static int factorialOfNumber(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {

            fact = fact * i;
            System.out.print("," + fact);
        }
        return fact;
    }
}
