package Z_practice_revision_others.ex_inifinityRevision;

public class Task19TradSwitch2 {
    static void main(String[] args) {

        char grade = 'A';
        String result = switch (grade) {
            case 'A' -> "grade1";
            case 'B' -> "grade2";
            default -> "No grade";
        };
        System.out.println(result);
    }
}
