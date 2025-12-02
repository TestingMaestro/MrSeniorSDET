package ex_z_practiceprograms;

public class Exc24ArrayDuplictes {
    static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 6, 7};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    newArr[j] = temp;
                }
            }
        }
        for (int result : newArr) {
            System.out.println(result);
        }

    }
}
