package Z_practice_revision_others.ex_inifinityRevision;

public class Task25CLIOptionsFact {
    static void main(String[] args) {

        String num1 = args[0];
        int num = Integer.parseInt(num1);
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
