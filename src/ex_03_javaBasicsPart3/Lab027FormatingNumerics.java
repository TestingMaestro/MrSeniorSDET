package ex_03_javaBasicsPart3;

public class Lab027FormatingNumerics {
    static void main(String[] args) {

        int a = 25;
        int b = 24;

        //Using printf
        System.out.printf("Value of a is %d \n", a);
        //using String.format()\
        System.out.println(String.format("Value of a and b is %d,%d", a, b));
    }
}
