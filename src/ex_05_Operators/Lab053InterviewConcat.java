package ex_05_Operators;

public class Lab053InterviewConcat {
    static void main(String[] args) {

        String firstName = "Yashodhar";
        String lastName = "karki";

        int a = 10;
        int b = 20;

        System.out.println(firstName + lastName + a + b);
        System.out.println(firstName + lastName + (a + b));

        System.out.println(a + b + firstName + lastName);
    }
}
