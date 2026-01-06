package ex_33_access_modifiers.relation1;

public class Child1 extends Parent {

    int gold;
    //Default Constructor defined by the compiler implicitly
   /* Child1() {
    }*/

    // If there is a IS-A relationship, there will be a subclass constructor initializing value for parent class constructor implicitly
    /* Child1() {
        super();
    }*/

    /*
       If we have declared Parameterized constructor in Parent class we have to call super class constructor to
       initialize value
     */
    public Child1(int gold) {
        super(20);
        this.gold = gold;
        System.out.println(super.gold); // parent Gold
    }

    void bhk3House() {
        System.out.println("3 BHK");
    }

    static void main(String[] args) {

        Child1 ch = new Child1(30);
        System.out.println(ch.gold); // Child Gold
        ch.bhk2House();
        ch.bhk3House();
    }

}
