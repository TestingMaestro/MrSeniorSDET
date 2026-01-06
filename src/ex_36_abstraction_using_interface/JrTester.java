package ex_36_abstraction_using_interface;

public class JrTester extends ClassTester implements InterfaceTester{

    @Override
    public void test() {
        System.out.println("Jr Tester");
    }

    @Override
    void display() {
        System.out.println("New Implementation");
    }
}
