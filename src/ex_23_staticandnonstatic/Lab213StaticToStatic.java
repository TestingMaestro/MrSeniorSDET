package ex_23_staticandnonstatic;

public class Lab213StaticToStatic {

    // static to static directly accessible
    static int a = 120;

    static void main(String[] args) {
        System.out.println(a);
        display();
    }

    static void display() {
        int b = 10;
        System.out.println(b);
    }
}
