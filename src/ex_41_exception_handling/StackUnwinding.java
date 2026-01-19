package ex_41_exception_handling;

public class StackUnwinding {
    static void main(String[] args) {

        try {
            disp1();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void disp5() {
        int i = 1 / 0;
    }

    static void disp4() {
        disp5();
    }

    static void disp3() {
        disp4();
    }

    static void disp2() {
        disp3();
    }

    static void disp1() {
        disp2();
    }
}
