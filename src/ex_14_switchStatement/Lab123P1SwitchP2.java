package ex_14_switchStatement;

import java.util.Scanner;

public class Lab123P1SwitchP2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        int day = 0;
        if (sc.hasNextInt()) {
            day = sc.nextInt();
        } else {
            System.out.println("Please enter valid Integer");
            System.exit(0);
        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed or error");
        }
    }
}
