package ex_29_polymorphism.runtimepolymorph;

public class ChromeBrowser extends Browser {
    @Override
    void open() {
        System.out.println("Opening the Chrome browser");
    }
}
