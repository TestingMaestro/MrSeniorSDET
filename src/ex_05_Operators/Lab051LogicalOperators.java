package ex_05_Operators;

public class Lab051LogicalOperators {
    static void main(String[] args) {

        int myAge = 30;
        int myWifeAge = 28;

        System.out.println(myAge >= myWifeAge || myAge <= myWifeAge);

        boolean m = true;

        System.out.println(!m);
        System.out.println(!!m);

        boolean n = true || false;
        System.out.println(n);

        System.out.println(true && false || (false && true));
    }
}
