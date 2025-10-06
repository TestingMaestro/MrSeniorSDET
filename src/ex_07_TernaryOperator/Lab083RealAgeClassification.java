package ex_07_TernaryOperator;

public class Lab083RealAgeClassification {
    static void main(String[] args) {

        int age = 18;
        String result = (age < 18) ? "Minor" : ((age < 65) ? "Adult" : "Senior Citizen");
        System.out.println(result);
    }
}
