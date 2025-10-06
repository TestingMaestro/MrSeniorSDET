package ex_07_TernaryOperator;

public class Lab078NestedTernary3
{
    static void main() {

        int num = 70;

        String result = (num > 10) ? (num > 30 ? "N>30": "N<30"):"B";
        System.out.println(result);
    }
}
