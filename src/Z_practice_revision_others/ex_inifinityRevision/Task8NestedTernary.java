package Z_practice_revision_others.ex_inifinityRevision;

public class Task8NestedTernary {
    static void main(String[] args) {

        int age = -2;

        String result = age > 0 ? (age >= 18 ? "Voting allowed" : "Voting not allowed") : "Invalid input";
        System.out.println(result);

    }
}
