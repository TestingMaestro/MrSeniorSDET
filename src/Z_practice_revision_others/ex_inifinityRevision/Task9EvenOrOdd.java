package Z_practice_revision_others.ex_inifinityRevision;

public class Task9EvenOrOdd {
    static void main(String[] args) {

        String result = evenOrOdd(45);
        System.out.println(result);
    }

    static String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
