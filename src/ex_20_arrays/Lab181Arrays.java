package ex_20_arrays;

import java.util.Arrays;

public class Lab181Arrays {
    static void main(String[] args) {

        int[] arr = {91, 20, 30, 34, 23, 21, 40};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[5]);
        System.out.println(arr[7]); //ArrayIndexOutOfBoundsException
    }
}
