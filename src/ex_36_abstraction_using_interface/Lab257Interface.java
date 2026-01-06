package ex_36_abstraction_using_interface;

public class Lab257Interface {

    static Polygon p1 = new Triangle();
    static Polygon p2 = new Rectangle();

    static void main(String[] args) {

        p1.getArea(2,4);
        p2.getArea(4,5);
    }
}

interface Polygon {
    void getArea(int len, int breadth);
}

class Triangle implements Polygon {
    public void getArea(int len, int breadth) {
        System.out.println("Area of triangle: " + (len * breadth));
    }
}
class Rectangle implements Polygon
{
    public void getArea(int len, int breadth) {
        System.out.println("Area of Rectangle: " + (len * breadth)/2);
    }
}

