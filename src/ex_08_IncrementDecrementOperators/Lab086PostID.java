package ex_08_IncrementDecrementOperators;

public class Lab086PostID
{
    static void main() {

        int a = 10;
        System.out.println(++a); //11
        System.out.println(a); //11

        // Post Increment -> First print and then increment by 1

        int aPost = 90;
        System.out.println(aPost++);
        System.out.println(aPost++);
        System.out.println(aPost);
    }
}
