package ex_13_conditions;

public class Lab117If {
    static void main(String[] args) {

        int age = 21;
        if (age != 0 && age >= 18) {
            System.out.println("allowed to vote");
        } else System.out.println("Voting not allowed");
    }
}
