package ex_23_staticandnonstatic;

public class Lab212NonStaticP4 {
    int a = 20;
    String minni = "phaaaaa....phaak";

    void display() {
        System.out.println("Deep inside object");
    }

    static void main(String[] args) {

        Lab212NonStaticP4 lb1 = new Lab212NonStaticP4();
        Lab212NonStaticP4 lb2 = lb1;

        System.out.println(lb1.equals(lb2));

        lb2.a = 100;
        System.out.println(lb1.a);

        System.out.println(lb1);
        System.out.println(lb2);

    }
}
