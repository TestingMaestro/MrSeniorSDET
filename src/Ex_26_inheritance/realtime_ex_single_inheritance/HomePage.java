package Ex_26_inheritance.realtime_ex_single_inheritance;

public class HomePage extends BasePage {

    void homePageTC() {
        System.out.println("After logging in, Home page is displayed");
        closeBrowser();
    }
}
