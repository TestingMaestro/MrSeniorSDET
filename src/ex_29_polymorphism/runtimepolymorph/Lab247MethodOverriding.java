package ex_29_polymorphism.runtimepolymorph;

public class Lab247MethodOverriding {
    static void main(String[] args) {

        // Binding happens at runtime by JVM based on object creation
        Browser b1 = new ChromeBrowser(); // Dynamic Method Dispatch
        b1.open(); // JVM decides Method call with Chrome implementation

        Browser b2 = new EdgeBrowser();
        b2.open();
    }
}
