package Z_practice_revision_others.ex_z_practiceprograms;

public class Exec31ArrayLengthSort {
    static void main(String[] args) {

        String[] arr = {"Xpulse 210",
                "Harley Davidson forty eight",
                "Himalayan 450",
                "Bear 650",
                "GT 650", "Interceptor 650", "Bebo"};
        reverseStringsUsingLength(arr);

    }

    static void reverseStringsUsingLength(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - i - 1]);
        }
    }
}