package ex_20_arrays;

import java.util.Scanner;

public class Lab185MaxMinArrray {

    static int[] arr = {100, 20, 45, 999, 49, 22, 10};

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();
        int maxElement = maxElementInArray(num1);
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();
        int minElement = minElementInArray(num2);

        System.out.println("Max element is " + maxElement);
        System.out.println("Min element is " + minElement);
    }

    static int maxElementInArray(int max) {
        max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[arr.length - 1] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minElementInArray(int min) {
        min = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}
