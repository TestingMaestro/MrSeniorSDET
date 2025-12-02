package ex_inifinityRevision;

import java.util.Scanner;

public class Task19RalTimeAutomation {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser name");
        if (sc.hasNextLine()) {
            String browser = sc.nextLine();
            String result = browserLogin(browser);
            System.out.println(result);
        } else {
            System.out.println("Browser Doesn't exist");
            System.exit(0);
        }
    }

    static String browserLogin(String browser) {

        browser = browser.toLowerCase();
        String browserLoginn =
                switch (browser) {
                    case "chrome" -> "Logging in to Chrome Browser";
                    case "firefox" -> "Logging in to Firefox Browser";
                    case "edge" -> "Logging in to Edge Browser";
                    default -> browser + " Not supported";
                };
        return browserLoginn;
    }
}
