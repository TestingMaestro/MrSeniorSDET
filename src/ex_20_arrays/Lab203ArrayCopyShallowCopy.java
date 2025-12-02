package ex_20_arrays;

public class Lab203ArrayCopyShallowCopy {
    static void main(String[] args) {

        // Shallow copy
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {};

        for (int i = 0; i < arr1.length; i++) {
            arr2 = arr1;
            System.out.println(arr2[i]);
        }
    }
}
