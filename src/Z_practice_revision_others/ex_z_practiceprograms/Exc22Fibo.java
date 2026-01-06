package Z_practice_revision_others.ex_z_practiceprograms;

public class Exc22Fibo {
    static void main(String[] args) {

        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series --> " + a + "," + b);
        for (int i = 0; i < 10; i++) {
            int fib = a + b;
            System.out.print("," + fib);
            a = b;
            b = fib;
        }
    }
}
