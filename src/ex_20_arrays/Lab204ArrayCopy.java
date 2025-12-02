package ex_20_arrays;

import java.util.Arrays;

public class Lab204ArrayCopy {
    static void main(String[] args) {

        // Deep copy
        int[] arr1 = {1, 2, 4};
        int[] arr2 = new int[arr1.length];

        //Method 1
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//            System.out.println((arr2[i]));
//        }

        // Method 2
        int arr3[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr3[1]);

    }
}
