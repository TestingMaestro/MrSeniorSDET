package ex_20_arrays;

public class Lab196SortArrays {
    static void main(String[] args) {

        int[] arr = {1, 33, 21, 40, 20, 30, 32};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
