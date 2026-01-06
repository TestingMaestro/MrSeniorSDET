package ex_28_method_overriding;

public class Lab242Ov {
    static void main(String[] args) {

        Vtu v = new Student1();
        Vtu vtu = new Student2();

        v.marks();
        vtu.marks();
    }
}
