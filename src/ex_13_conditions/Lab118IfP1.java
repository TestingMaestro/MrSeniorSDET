package ex_13_conditions;

public class Lab118IfP1 {
    static int age;

    static void main(String[] args) {

        String tripAge = args[0];
        int age = Integer.parseInt(tripAge);
        eligibilityGoa(age);

    }

    static void eligibilityGoa(int age) {
        if (age != 0)
            if (age >= 18) {
                System.out.println("Allowed to go to goa");
            } else {
                System.out.println("Not allowed");
            }
        else {
            System.out.println("Please Enter valid age");
        }
    }
}
