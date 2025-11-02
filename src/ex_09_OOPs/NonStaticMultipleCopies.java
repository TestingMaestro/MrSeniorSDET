package ex_09_OOPs;

public class NonStaticMultipleCopies {
    int count = 0; // for each object 1 copy

    NonStaticMultipleCopies() {
        count++;
        System.out.println(count);
    }

    static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new NonStaticMultipleCopies(); // One copy for each object
        }
    }
}
