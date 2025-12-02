package ex_20_arrays;

public class Lab198TwoDArrays {
    static void main(String[] args) {

        int[][] arr2D = new int[3][3];
        // old

        int[][] arr2DOld = {{1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}};

        int[][] arr;
        arr = new int[3][3];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;

        arr2D[1][0] = 4;
        arr2D[1][1] = 5;
        arr2D[1][2] = 6;

        arr2D[2][0] = 7;
        arr2D[2][1] = 8;
        arr2D[2][2] = 9;
    }
}
