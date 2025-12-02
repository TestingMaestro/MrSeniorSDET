package ex_20_arrays;

public class Lab205WithoutusingTemp {

    static void main(String[] args) {

        int[] arr = {100, 20, 45, 999, 49, 22, 10,199};
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                 arr[i] = arr[i] ^ arr[j];
                 arr[j] = arr[i] ^ arr[j];
                 arr[i] = arr[i] ^ arr[j];
                }
            }
        }
        int max = sortedArr[0];
        for (int k = 0; k < arr.length; k++) {
            sortedArr[k] = arr[k];
            System.out.println(sortedArr[k]);
        }
    }
}
