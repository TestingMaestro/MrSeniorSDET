package ex_25_OOPsConstructor;

public class Lab234CallByReference
{
    // invoking method by passing reference or object - Pass by reference

    int a = 100;

    static void main(String[] args) {
        Lab234CallByReference ref = new Lab234CallByReference();
        ref.display(ref); // or

        ref.display(new Lab234CallByReference());

    }

    void display(Lab234CallByReference ref)
    {
        System.out.println(ref.a);
    }
}
