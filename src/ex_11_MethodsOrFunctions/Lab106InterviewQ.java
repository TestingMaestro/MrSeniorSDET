package ex_11_MethodsOrFunctions;

public class Lab106InterviewQ {
    /*
     * can we overload or can we have multiple main methods?
     * Yes, we can have multiple main methods
     * Method Overloading - Developing multiple methods with the same name and variation with ar list
     * 1. Variation with type of arguments
     * 2. Variation with order if occurrence of args
     * 3. Variation with length of args
     * */

    static void main(String[] args) {

        main("Yash");
        float a = main(20.2f);
        System.out.println(a);
    }

    static void main(String args) {
        System.out.println(args);
    }

    static int main(int args) {
        return 10;
    }

    static float main(float args) {
        return args;
    }
}
