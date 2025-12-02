package ex_20_arrays;

import java.util.Scanner;

public class Lab192ArrayStringReverseUsingArraysOnly {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        String[] arr = new String[size];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element at index " + i);
            arr[i] = sc.next();
            sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            String reversed = "";
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                reversed = reversed + arr[i].charAt(j);
            }
            arr[i] = reversed;
        }
        for (String reversedString : arr) {
            System.out.println(reversedString);
        }
    }
}

