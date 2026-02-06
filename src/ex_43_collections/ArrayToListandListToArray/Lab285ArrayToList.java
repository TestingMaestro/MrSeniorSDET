package ex_43_collections.ArrayToListandListToArray;

import java.util.*;

public class Lab285ArrayToList {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at " + i + " th index");
            arr[i] = sc.nextInt();
        }

        for (Integer ele : arr) {
            System.out.println(ele);
        }

        List<Integer> l1 = Arrays.asList(arr);
        System.out.println(l1);

    }

}
