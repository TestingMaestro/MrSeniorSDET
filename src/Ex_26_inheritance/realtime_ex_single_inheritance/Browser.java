package Ex_26_inheritance.realtime_ex_single_inheritance;

import java.util.Scanner;

public class Browser {
    String browser;
    Scanner sc = null;

    void browserOpen() {

        sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        browser = sc.nextLine().toLowerCase();
        switch (browser) {
            case "Chrome" -> System.out.println("Opening Chrome Browser");
            case "Edge" -> System.out.println("Opening Edge Browser");
            default -> System.exit(0);

        }
        sc.close();

    }

    void closeBrowser() {
        System.out.println("Closing " + browser);
    }
}