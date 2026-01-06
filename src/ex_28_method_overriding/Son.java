package ex_28_method_overriding;

public class Son extends Father {

    void motorCycle() {
        System.out.println("Riding TVS Apache RTX 300");
    }

    static void main(String[] args) {

        Father f1 = new Son(); // Dynamic Method Dispatch
        f1.motorCycle();
    }
}
