package ex_15_ForLoop;

public class Lab146ForLoopContinueforEvenOdd {
    static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> " + i);
        }
    }
}