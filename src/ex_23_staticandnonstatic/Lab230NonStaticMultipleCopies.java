package ex_23_staticandnonstatic;

public class Lab230NonStaticMultipleCopies
{
    int count = 0; // Separate copy for each object created - Multiple copy

    Lab230NonStaticMultipleCopies() {
        count++;
        System.out.println(count);
    }

    static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Lab230NonStaticMultipleCopies();
        }
    }
}
