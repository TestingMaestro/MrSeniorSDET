package ex_32_final_concept;

public class Lab252Final2
{
    final void v1()
    {
        System.out.println("We can inherit final method");
    }
}
class FinalMethod1 extends Lab252Final2
{
    static void main(String[] args) {

        FinalMethod1 f1 = new FinalMethod1();
        f1.v1(); // We can inherit final method
    }
}
