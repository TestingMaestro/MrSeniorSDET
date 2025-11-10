package ex_14_switchStatement;

import java.util.Scanner;

public class Lab125RealTimeAutomation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = sc.next();
        browserSelect(browser);
    }

    static void browserSelect(String browser) {

        switch (browser) {
            case "Chrome":
                System.out.println("Running scripts on Chrome Browser");
                break;
            case "Edge":
                System.out.println("Running scripts on Edge Browser");
                break;
            case "Firefox":
                System.out.println("Running scripts on Firefox Browser");
                break;
            default:
                System.out.println("no Browser");
        }
    }
}
