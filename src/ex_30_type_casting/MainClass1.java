package ex_30_type_casting;

public class MainClass1 {
    static void main(String[] args) {

        Father f1 = new Son();
        System.out.println(f1.gold2);//access his own property and its superclass properties
        System.out.println(f1.gold);
        f1.bhk1();
        f1.bhk2();

        Son s1 = (Son) f1;
        s1.bhk3();

        Son s2 = (Son) new GrandFather();
        s2.bhk3();
    }
}
