package ex_23_staticandnonstatic;

public class Lab214NonStaticToNonStatic {
    int a = 10;

    static void main(String[] args) {
        //Nonstatic to static - Create a object
        Lab214NonStaticToNonStatic lb = new Lab214NonStaticToNonStatic();
        lb.display();

    }

    void display() {
        a = 20;
        System.out.println(a);
    }
}
