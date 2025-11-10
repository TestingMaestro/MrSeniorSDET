package ex_17_dowhileloop;

public class Lab159WhileDoWhileDifference {
    static void main(String[] args) {

        int x = 0;
        while (x < 0) {
            System.out.println("doesn't come to loop body because condition is false");
            System.out.println(x);
            x++;
        }
        do {
            System.out.println("Executes once before condition is checked");
            System.out.println(x);
            x++;
        } while (x < 0);
    }
}
