package ex_15_ForLoop;

public class Lab148ForLoopContinueForEven {
    static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even -> " + i);
        }

        for (int i = 20; i > 0; i--) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even -> " + i);
        }
    }
}