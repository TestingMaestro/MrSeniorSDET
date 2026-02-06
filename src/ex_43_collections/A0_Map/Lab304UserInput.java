package ex_43_collections.A0_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab304UserInput {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> employee = new HashMap<>();

        String wantToContinue = "Y";
        while(wantToContinue.equalsIgnoreCase("Y")) {
            System.out.println("Enter Key");
            String keys = sc.nextLine();
            System.out.println("Enter Value");
            Integer values = sc.nextInt();
            sc.nextLine();
            employee.put(keys, values);

            System.out.println("Do you want to continue with another entry (Y/N)");
            wantToContinue = sc.next();

        }
        for (Map.Entry<String, Integer> entry : employee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        sc.close();
    }
}
