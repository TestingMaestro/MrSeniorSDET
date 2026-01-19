package ex_42_generics;

public class GenericClass2 {

    // Static Generic method with return type void and with Generic param
    static <T> void show(T value) {
        System.out.println("Show: " + value);
    }

    // Static generic method returning Generic Type
    static <T> T getValue(T value) {
        return value;
    }

    static void main(String[] args) {

        Box1<String> b1 = new Box1<>("Yashu");
        b1.display("Souparnika");
        String s1 = b1.getValue();
        System.out.println(s1.toLowerCase());

        show("Hello static generic method");
        String ss = getValue("Benki");
        System.out.println(ss);
    }
}

// Class using Generics declaration
class Box1<T> {
    T value; // Generic variable

    // Constructor using generic type
    Box1(T value) {
        this.value = value;
    }

    // Non - static method returning Generic Type
    public T getValue() {
        return value;
    }

    // Method with Generic Type parameter
    void display(T value) {

        System.out.println("Box display: " + value);
    }

}
