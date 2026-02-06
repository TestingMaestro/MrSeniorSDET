package ex_43_collections.A_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab290UserInputCollection {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        // We don't know the size, we will go for while

        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter the Name");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter the Age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();

            System.out.println("Do you want to add another record? (Y/N)");
            continueInput = sc.nextLine();

        }
        for (String s1 : names) {
            System.out.println(s1);
        }
        for (Integer i1 : ages) {
            System.out.println(i1);
        }
        sc.close();
    }
}
