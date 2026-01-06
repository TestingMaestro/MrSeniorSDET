package Ex_26_inheritance.single_inheritance;

public class TestCase3 extends CommonToAll {

    void runningTestCase3() {
        openBrowser();
        readDatabaseFile();
        readExcelFile();
        System.out.println("Running TC 3");
        closeBrowser();
    }
}
