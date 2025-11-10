package ex_15_ForLoop;

public class Lab134EvenOrOddFromTop10 {
    static void main(String[] args) {
        System.out.println("Even Numbers are");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Odd Numbers are");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
