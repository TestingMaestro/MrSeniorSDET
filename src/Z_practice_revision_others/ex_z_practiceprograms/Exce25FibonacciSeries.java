package Z_practice_revision_others.ex_z_practiceprograms;

public class Exce25FibonacciSeries {
    static void main(String[] args) {

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 5; i++) {
            int fibo = 0;
            fibo = a + b;
            System.out.println(fibo);
            a = b;
            b = fibo;
        }

    }
}
