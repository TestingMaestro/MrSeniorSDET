package ex_25_OOPsConstructor;

public class Lab232VariableShadowing {
    int a = 100;

    static void main(String[] args) {
        int a = 30; // Local variable shadows the global variable
        System.out.println(a);
        Lab232VariableShadowing lv = new Lab232VariableShadowing();
        lv.display();
    }

    void display() {
        System.out.println(this.a);// To solve variable shadowing
    }
}
