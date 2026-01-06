package Z_practice_revision_others.ex_inifinityRevision;

public class Task11AgeClassification {
    static void main(String[] args) {

        String result = ageClassification(17);
        String result1 = ageClassification(78);
        String result2 = ageClassification(45);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    static String ageClassification(int age) {
        return age < 18 ? "Minor" : age < 65 ? "Adult" : "Senior Citizen";
    }
}
