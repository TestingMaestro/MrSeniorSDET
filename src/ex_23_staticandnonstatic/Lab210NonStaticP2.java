package ex_23_staticandnonstatic;

public class Lab210NonStaticP2 {
    int age = 30;
    String name = "Yash";

    void details() {
        System.out.println(name);
        System.out.println(age);
    }

    static void main(String[] args) {

        Lab210NonStaticP2 lb2 = new Lab210NonStaticP2();
        Lab210NonStaticP2 lb3 = new Lab210NonStaticP2();
        lb2.details();

        //access separately
        System.out.println("Name and the Age is: " + lb2.name + ", " + lb2.age);

        System.out.println(lb2);
        System.out.println(lb3);
    }
}
