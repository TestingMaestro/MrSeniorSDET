package ex_inifinityRevision;

import java.util.Arrays;

public class Task31MaxValueInArray {
    static void main(String[] args) {


        int[] arr = {2, 30, 3, 21, 100, 22};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
