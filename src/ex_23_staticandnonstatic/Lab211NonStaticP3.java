package ex_23_staticandnonstatic;

public class Lab211NonStaticP3 {
    static void main(String[] args) {
        Lab211NonStaticP3 lb1 = new Lab211NonStaticP3();
        Lab211NonStaticP3 lb2 = new Lab211NonStaticP3();

        System.out.println(lb1.a);
        System.out.println(lb1.minni);

        System.out.println(lb2.a);
        System.out.println(lb2.minni);

        lb2.a = 90;
        System.out.println(lb2.a);
        System.out.println(lb1.a);


    }

    int a = 20;
    String minni = "phaaaaa....phaak";

    void deep() {
        System.out.println("Deep inside object");
    }
}
