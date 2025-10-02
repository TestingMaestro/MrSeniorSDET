package ex_02_javabasicsPart2;

public class Lab025LocalVariables {
    static void main(String[] args) {

        /* Local variable:
         * Variable which is declared within the method body within the class
         * Scope is from beginning of the method till end of the method
         * It is not classified as static/non-static
         * Once the local variable is declared, it can't be utilized before initialization
         * Due to above stuff, it doesn't have any default values
        */

        int a = 10;
        //or
        System.out.println(a);
        int b;
        b = 20;
        System.out.println(b);
    }
}
