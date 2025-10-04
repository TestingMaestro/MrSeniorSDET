package ex_05_Operators;

public class Lab049RelationalOperator {
    static void main(String[] args) {

        /*
         * >
         * <
         * >=
         * <=
         * !=
         * ==
         * */

        int a = 100;
        int b = 90;
        boolean res = a > b;
        System.out.println(res);

        int a1 = 100;
        int b1 = 90;
        boolean res1 = a1 <= b1;
        System.out.println(res1);

        System.out.println(20 <= 20);

        System.out.println(10 != 10);

        System.out.println(10 == 10);

        System.out.println(true == false);

        System.out.println( 0 == 0);
    }
}
