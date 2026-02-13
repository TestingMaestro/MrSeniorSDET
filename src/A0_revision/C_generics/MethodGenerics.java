package A0_revision.C_generics;

public class MethodGenerics<T> {

    static <T> void display() {
        System.out.println("Method with Generic type returing void");
    }

    T show(T value) {
        return value;
    }

    static <T> T sum(T s1) {
        return s1;
    }
}

class MainClass {

    static void main(String[] args) {

        MethodGenerics<String> n = new MethodGenerics<>();
        String nn = n.show("Meow");
        System.out.println(nn);
        MethodGenerics.display();

    }
}
