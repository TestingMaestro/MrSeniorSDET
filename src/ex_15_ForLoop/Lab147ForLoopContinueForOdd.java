package ex_15_ForLoop;

public class Lab147ForLoopContinueForOdd {
    static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }
    }
}