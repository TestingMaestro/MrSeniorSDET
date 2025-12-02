package ex_20_arrays;

public class Lab199TwoDArrayIterateForLoop {

    static void main(String[] args) {

        int[][] arr2DOld = {{1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}};
        System.out.println("Rows ---> " + arr2DOld.length);
        for (int i = 0; i < arr2DOld.length; i++) {
            for (int j = 0; j < arr2DOld[i].length; j++) {

                //System.out.print(arr2DOld[i][j] + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }

//        String s1 = "java";
//        String s2 = s1.toUpperCase();
//        System.out.println(s1);

        String s = new String("Hello");
        String ss = s.intern();
        System.out.println(ss);
    }
}
