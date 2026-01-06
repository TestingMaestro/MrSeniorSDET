package ex_33_access_modifiers.relation1;

public class Parent {
    int gold;

    //Default Constructor defined by the compiler implicitly
    /*Parent(){
    }*/
    public Parent(int gold) {
        this.gold = gold;
    }
    protected void bhk2House() {
        System.out.println("2 BHK");
    }
}
