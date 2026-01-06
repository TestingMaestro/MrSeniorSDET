package Ex_26_inheritance.realtime_ex_single_inheritance;

public class TestCase1 extends ReusableMethods {

    void runTC1() {
        browserOpen();
        waitForElement();
        System.out.println("Running TC1");
        closeBrowser();
    }
}
