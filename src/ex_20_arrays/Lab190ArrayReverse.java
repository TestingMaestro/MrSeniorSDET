package ex_20_arrays;

import java.util.Scanner;

public class Lab190ArrayReverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element at index " + i);
            arr[i] = sc.nextInt();
        }
        // Printing the elements
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
