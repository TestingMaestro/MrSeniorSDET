package ex_27_method_overloading;

import java.util.Scanner;

public class Overload1 {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        add(12, 13);
        add(12);
        add(12.5f);
        String result = add("Yashodhar", "karki");
        System.out.println(result);
    }

    static void add(int a, int b) {

        int addInt = a + b;
        System.out.println(addInt);
    }

    static void add(int a) {
        int addInt = a + a;
        System.out.println(addInt);
    }

    static void add(float a) {
        float addInt = a + a;
        System.out.println(addInt);
    }

    static String add(String fName, String lName) {
        return fName + " " + lName;
    }
}
