package ex_07_TernaryOperator;

public class Lab076NestedTernary2
{
    static void main() {

        int a = 70;
        int b = 120;
        int c = 230;

        String result = (a > b && a > c) ? "A is Greater" : (b > c ? "b is greater" : "c is greater");
        System.out.println(result);
    }
}
