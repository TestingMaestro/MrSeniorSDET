package ex_32_final_concept;

final public class Lab251Final1 {
    final double PI = 3.1412;

    final void testMethod() {
        System.out.println("Final Method");
    }
}

class myClass1 {
    // since we can not inherit or extend the final class, we cannot override as well
    // String is a final class and we can create object for String class
    // String name = new String("Yashu");
    final void testMethod() {

    }

    static void main(String[] args) {

        // We can create object for final class
        Lab251Final1 l1 = new Lab251Final1();
        l1.testMethod();
    }
}
/*class fN1 extends Lab251Final1 // cannot inherit final class Lab251Final1
{
    void myfn1()
    {

    }
}*/
