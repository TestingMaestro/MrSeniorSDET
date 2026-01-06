package Z_practice_revision_others.ex_z_practiceprograms;

public class Exc4GradeCalc {
    static void main(String[] args) {

        int gradeMark = 110;

        String result;
        result = (gradeMark <= 0) ? "Invalid Grade" : ((gradeMark <= 59) ? "F" : gradeMark <= 69 ? "D" : gradeMark <= 79 ? "C" : gradeMark <= 89 ? "B" : "A");
        System.out.println(result);
    }
}
