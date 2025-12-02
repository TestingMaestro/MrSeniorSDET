package ex_23_staticandnonstatic;

public class LaB208StaticP2 {
    static void main(String[] args) {

        VTU.conductsExam();
        System.out.println("Students Strength " + VTU.studentStrength);
        System.out.println("College Rank " + VTU.collegeRank);
        System.out.println("Total TurnOver " + VTU.totalTurnover);
    }
}

class VTU {
    static int studentStrength;
    static String collegeRank;
    static String totalTurnover;

    static void conductsExam() {

        System.out.println("Running Conducts Exam");
    }
}

