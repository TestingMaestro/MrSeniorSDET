package ex_36_abstraction_using_interface;

public class MainClassTester
{
    static void main(String[] args) {

        JrTester j = new JrTester();
        j.test();
        ClassTester cl = new ClassTester();
        cl.display();

    }
}
