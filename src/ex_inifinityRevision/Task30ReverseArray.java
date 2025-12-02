package ex_inifinityRevision;

import java.util.ArrayList;
import java.util.Scanner;

public class Task30ReverseArray {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = 0;



        if (sc.hasNextInt()) {
            size = sc.nextInt();
            int[] arrInt = new int[size];
            for (int i = 0; i < arrInt.length; i++) {
                System.out.println("Enter the element at " + i + " th index");
                arrInt[i] = sc.nextInt();
            }

            //accessing elements
            for (int i = 0; i < arrInt.length; i++) {
                System.out.println(arrInt[arrInt.length - i - 1]);
            }

        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }

        sc.close();
    }
}
