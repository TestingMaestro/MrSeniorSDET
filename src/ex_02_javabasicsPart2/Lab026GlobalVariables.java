package ex_02_javabasicsPart2;

public class Lab026GlobalVariables {
    int a; //possible
    int b = 10; //possible
    int c;
    // c=10; //not possible
    static int d;

    static void main(String[] args) {

        d = 90;
        System.out.println(d);
    }
}
