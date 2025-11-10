package ex_14_switchStatement;

import java.util.Scanner;

public class Lab122P1Switch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("FCD");
                break;
            case 'B':
                System.out.println("First class");
                break;
            case 'C':
                System.out.println("Second class");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
