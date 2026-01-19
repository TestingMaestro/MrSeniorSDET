package ex_40wrapper;

public class Lab260UnboxingAutoboxing {
    static void main(String[] args) {

        int a = 10;
        Integer b = a; //Autoboxing
        System.out.println(b.intValue());

        Integer a1 = 90;
        int pri = a1; //Unboxing --> Attributes and behaviour is lost
        System.out.println(pri);
    }
}
