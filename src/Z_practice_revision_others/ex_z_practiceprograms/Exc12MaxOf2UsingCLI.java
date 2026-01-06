package Z_practice_revision_others.ex_z_practiceprograms;

public class Exc12MaxOf2UsingCLI {
    static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);

        String maxOf2 = m > n ? "m is max" : "n is max";
        System.out.println(maxOf2);
    }
}
