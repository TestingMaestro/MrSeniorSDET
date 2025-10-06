package ex_07_TernaryOperator;

public class Lab076NestedTernary {
    static void main() {

        int age = -1;

        String rs = (age > 0) ? (age >= 18 ? "Caste Vote" : "Voting not allowed") : "Minor";
        System.out.println(rs);


    }
}
