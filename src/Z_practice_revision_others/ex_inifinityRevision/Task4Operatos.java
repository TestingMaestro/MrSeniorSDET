package Z_practice_revision_others.ex_inifinityRevision;

public class Task4Operatos {
    static void main(String[] args) {

        //assignment
        int a = 10;
        int b = 20;

        //Relational
        System.out.println("Relational");
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a != b);

        //Logical
        System.out.println("Logical");
        System.out.println(a == b && b == a);
        System.out.println(a == b || b == a);
        System.out.println(!(a == b));

        //Bitwise
        System.out.println("Bitwise");
        System.out.println(a & b);
        System.out.println(a | b);

        //Arithmetic
        System.out.println("Arithmetic");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(b / a);
        System.out.println(a * b);
        System.out.println(a % b);

        //Unary
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(~a);

    }
}
