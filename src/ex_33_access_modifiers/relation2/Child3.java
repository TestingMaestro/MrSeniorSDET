package ex_33_access_modifiers.relation2;

import ex_33_access_modifiers.relation1.Parent;

public class Child3 extends Parent {
    void bhk4House() {
        System.out.println("BHK 4");
    }
    public Child3(int gold) {
        super(12);
    }

    static void main(String[] args) {

        Child3 c3 = new Child3(2);
        c3.bhk2House();

    }
}