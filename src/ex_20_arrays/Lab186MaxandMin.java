package ex_20_arrays;

public class Lab186MaxandMin {
    static void main(String[] args) {

        int[] arr = {10, 15, 2, 45, 10, 1, 70, 89, 22, 19};

        int max = giveMeMaxElement(arr);
        int min = giveMinElement(arr);
        System.out.println("Maximum Element in the array of integers is --> " + max);
        System.out.println("Minimum Element in the array of integers is --> " + min);
    }

    static int giveMinElement(int[] arr) {
        int min = arr[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int giveMeMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
