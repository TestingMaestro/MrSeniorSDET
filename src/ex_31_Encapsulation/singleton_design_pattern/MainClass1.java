package ex_31_Encapsulation.singleton_design_pattern;

public class MainClass1 {

    static void main(String[] args) {

        Singleton2 obj1 = Singleton2.getInstance();
        obj1.showMessage();
        Singleton2 obj2 = Singleton2.getInstance();
        obj2.showMessage();

        System.out.println(obj1 == obj2);
    }

}
