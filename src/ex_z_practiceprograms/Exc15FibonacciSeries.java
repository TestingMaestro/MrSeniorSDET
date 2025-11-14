package ex_z_practiceprograms;

public class Exc15FibonacciSeries {
    static void main(String[] args) {

        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series: " + a + "," + b);

        for (int i = 0; i < 10; i++) {
            int fibo = 0;
            fibo = a + b;
            System.out.print("," + fibo);
            a = b;
            b = fibo;
        }
    }
}
