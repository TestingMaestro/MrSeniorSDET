package ex_31_Encapsulation.singleton_design_pattern;

public class MainClass
{
    static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();
        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();
        Singleton obj3 = Singleton.getInstance();
        obj3.showMessage();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
