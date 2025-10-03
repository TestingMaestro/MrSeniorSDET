package ex_03_javaBasicsPart3;

public class Lab033LiteralPercentModifier {
    static void main(String[] args) {

        float percentage = 90.20f;

        System.out.printf("Percentage is: 90%%", percentage);
        System.out.println(String.format("Percentage is: 90%%", percentage));
    }
}
