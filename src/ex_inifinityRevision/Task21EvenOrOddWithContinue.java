package ex_inifinityRevision;

public class Task21EvenOrOddWithContinue {
    static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i);
        }
    }
}
