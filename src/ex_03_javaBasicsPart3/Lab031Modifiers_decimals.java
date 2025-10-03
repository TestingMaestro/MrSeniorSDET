package ex_03_javaBasicsPart3;

public class Lab031Modifiers_decimals {
    //Modifier using String.format()
    static void main(String[] args) {

        double piValue = Math.PI;
        System.out.println("Value of PI: " + piValue);
        System.out.println(String.format("Restricting to 2 decimal places: %.2f", piValue));
    }
}
