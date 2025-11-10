package ex_15_ForLoop;

public class Lab137ForLoopWithIf {
    static void main(String[] args) {

        int age = 0;
        for (age = 0; age < 18; age++) {
            if (age > 14) {
                System.out.println("Gets gift from dad");
            } else System.out.println("No Gift");
        }
    }
}
