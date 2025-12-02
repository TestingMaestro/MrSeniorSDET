package ex_23_staticandnonstatic;

public class Lab209NonStaticP1 {
    int a = 40;
    int b = 30;
    int c = 55;

    void disp() {
        System.out.println("Running disp()");
    }

    static void main(String[] args) {

        // Creating obj
        Lab209NonStaticP1 lb1;
        System.out.println(new Lab209NonStaticP1().a);
        System.out.println(new Lab209NonStaticP1().b);
        System.out.println(new Lab209NonStaticP1().c);
        lb1 = new Lab209NonStaticP1();
        lb1.a = 99;
        System.out.println("Updated value of a: " + lb1.a);
        new Lab209NonStaticP1().disp();

    }

}
