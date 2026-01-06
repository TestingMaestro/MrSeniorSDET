package ex_25_OOPsConstructor;

public class Lab235CompositionConcept
{
    static void main(String[] args) {

        Demo.s1.display(); // Same Like - System.out.println()
    }
}

//PrintStream Class
class Sample
{
    int a = 10;
    void display()
    {
        System.out.println("Running Display");
    }
}
class Demo
{
    static Sample s1 = new Sample();
}
