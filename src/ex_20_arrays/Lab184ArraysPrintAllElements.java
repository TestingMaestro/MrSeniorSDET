package ex_20_arrays;

public class Lab184ArraysPrintAllElements {
    static void main(String[] args) {

        int[] arr = {10, 11, 12, 13, 14, 15, 16};
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}
