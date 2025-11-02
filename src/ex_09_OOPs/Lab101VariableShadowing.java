package ex_09_OOPs;

public class Lab101VariableShadowing {
    static void main(String[] args) {

        ShadowVariable sv = new ShadowVariable();
        sv.display();
    }
}

class ShadowVariable {
    int a = 30;

    void display() {
        int a = 90; // Local Variable shadows global variable
        System.out.println(a);

        // if we use this.a then we can get the global value
        System.out.println(this.a);
    }
}
