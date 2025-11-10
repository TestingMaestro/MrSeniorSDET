package ex_14_switchStatement;

import java.util.Scanner;

public class Lab124P1SwitchP2NoBreak {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        int day = 0;
        if (sc.hasNextInt()) {
            day = sc.nextInt();
        }
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Not allowed or error");
        }
    }
}
