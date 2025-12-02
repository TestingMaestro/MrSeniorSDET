package ex_23_staticandnonstatic;

public class Lab229StaticSingleCopy {
    static int count = 0;

    Lab229StaticSingleCopy() {
        count++;
        System.out.println(count);
    }

    static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Lab229StaticSingleCopy(); // One copy shared among all objects
        }
    }
}
