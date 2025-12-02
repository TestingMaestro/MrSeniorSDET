package ex_20_arrays;

public class Lab182Arrays {
    static void main(String[] args) {

        int[] marks = {1, 2, 3, 4, 5, 6};
        int[] marks2 = new int[5];// Size is Fixed

        String[] names = new String[5];
        names[0] = "Yash";
        names[1] = "Pammu";
        names[2] = "Lucky";

        System.out.println(names[1]);
        System.out.print("{");
        for (int i = 0; i < names.length; i++) {
            System.out.print("," + names[i]);
        }
        System.out.print("}");

    }
}
