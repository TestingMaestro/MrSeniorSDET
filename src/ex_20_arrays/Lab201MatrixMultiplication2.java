package ex_20_arrays;

public class Lab201MatrixMultiplication2 {
    static void main(String[] args) {

        int[][] matrixA = {{1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}};
        int[][] matrixB = {{1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}};
        int[][] matrixC = {};
        for (int i = 0; i < matrixA.length; i++) {
            {
                for (int j = 0; j < matrixA[i].length; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }

            for (int k = 0; k < matrixB.length; k++) {
                for (int j = 0; j < matrixB[k].length; j++) {
                    System.out.print(matrixB[k][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

