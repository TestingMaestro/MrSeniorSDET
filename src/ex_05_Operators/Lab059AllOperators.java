package ex_05_Operators;

public class Lab059AllOperators {
    static void main(String[] args) {

        // Assignment Operators
        int a = 20;

        //Relational Ops
        int x = 100;
        int y = 90;

        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x != y);
        System.out.println(x == y);

        //Arithmetic Ops
        float c = 3.0f;
        double re = x / y;
        System.out.println(a + x);
        System.out.println(a * x);
        System.out.println(a - y);
        System.out.println(a / c);
        System.out.println(String.format("%.2f", (re)));

        //Unary Ops
        int z = -10;
        int v = +45;

        // Logical Ops
        int myAge = 30;
        int myWifeAge = 28;

        System.out.println(myAge >= myWifeAge || myAge <= myWifeAge);

        boolean m = true;

        System.out.println(!m);
        System.out.println(!!m);

        boolean n = true || false;
        System.out.println(n);

        System.out.println(true && false || (false && true));

        // Compound Assignment Ops [+=, -=, *=, /=, %=]
        int myAgee = 30;
        myAgee += 91;
        System.out.println(myAgee);
        myAgee -= 91;
        System.out.println(myAgee);


    }
}
