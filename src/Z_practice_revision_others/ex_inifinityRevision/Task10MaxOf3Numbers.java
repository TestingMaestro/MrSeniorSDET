package Z_practice_revision_others.ex_inifinityRevision;

public class Task10MaxOf3Numbers {
    static void main(String[] args) {

        String result = maxOfThreeNumbers(100, 200, 1130);
        System.out.println(result);
    }

    static String maxOfThreeNumbers(int a, int b, int c) {
        return a > b && a > c ? "A is greater" : b > c ? "B is Greater" : "c is greater";
    }
}
