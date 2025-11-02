package ex_11_MethodsOrFunctions;

public class Lab104SimpleMethod {
    static void main(String[] args) {

        noReturnFunction();
        int a = returningFunction();
        System.out.println(a);
        String name = ret3();
        System.out.println(name);
    }

    static void noReturnFunction() {
        System.out.println("I'm void, not returning anything");
    }

    static int returningFunction() {
        return 10;
    }

    static double ret() {
        return 20.2;
    }

    static byte ret1() {
        return 29;
    }

    static String ret3() {
        return "Yash";
    }

    static float ret4() {
        return 2.3f;
    }

    static boolean ret5() {
        return false;
    }
}
