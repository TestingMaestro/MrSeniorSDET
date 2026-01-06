package Z_practice_revision_others.ex_z_practiceprograms;

public class Exc3 {
    static void main(String[] args) {

        int X = 10;
        int Y = 10;
        int Z = 10;

        double res1 = (Math.pow(X, 2));
        double res2 = (Math.pow(Y, 2));

        double halfResult = res1 + res2 + Z;
        double totalResult = Math.cbrt(halfResult);

        System.out.println(String.format("%.2f", totalResult));
    }
}
