package ex_10_OOPsConstructor;

public class Lab95Example2 {
    static void main(String[] args) {

        WebAutomation w1 = new WebAutomation();
    }
}

class WebAutomation {
    WebAutomation() {
        System.out.println("I want to read CSV file");
        System.out.println("I want to Open the web page before loading any scripts");
        System.out.println("I want to do something when object is created");
    }
}
