package ex_inifinityRevision;

import java.util.Scanner;

public class Task17LegacySwitch2 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day");
        String days = sc.nextLine();
        switch (days) {
            case "Day1":
                System.out.println("Monday");
                break;
            case "Day2":
                System.out.println("Tuesday");
                break;
            case "Day4":
                System.out.println("Thursday");
                break;
            case "Day3":
                System.out.println("Wednesday");
                break;
            case "Day5":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Chill its weekend!!! Enjoy");
        }
    }
}
