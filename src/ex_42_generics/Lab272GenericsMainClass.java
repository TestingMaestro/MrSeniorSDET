package ex_42_generics;

public class Lab272GenericsMainClass {

    static void main(String[] args) {

        GenericsClass<String> stringObj = new GenericsClass<>("Yash");
        GenericsClass<Integer> intObj = new GenericsClass<>(100);
        stringObj.setData("Sou");
        System.out.println(stringObj.getData());
        System.out.println(intObj.getData());

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        box1.setBoxName("Fruits");
        box2.setBoxCount(200);
        System.out.println("Total boxes of " + box1.getBoxName() + " are " + box2.getBoxCount());
    }
}
