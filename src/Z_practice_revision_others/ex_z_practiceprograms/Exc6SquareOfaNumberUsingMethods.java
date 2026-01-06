package Z_practice_revision_others.ex_z_practiceprograms;

public class Exc6SquareOfaNumberUsingMethods {
    static void main(String[] args) {
        square(2);
        square(4); // code reusability

    }

    static void square(int s) {
        int squareN = s * s;
        System.out.println(squareN);
    }
}
