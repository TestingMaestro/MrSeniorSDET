package ex_09_OOPs;

public class StaticSingleCopyOnePerClass {
    static int count = 0; // Shared among all objects

    StaticSingleCopyOnePerClass() {
        count++;
        System.out.println(count);
    }

    static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new StaticSingleCopyOnePerClass(); // shared among all objects
        }
    }
}
