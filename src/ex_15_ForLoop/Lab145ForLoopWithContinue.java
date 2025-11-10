package ex_15_ForLoop;

public class Lab145ForLoopWithContinue {
    static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
