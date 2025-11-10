package ex_14_switchStatement;

public class Lab130NewSwitchJdk13Above {
    static void main(String[] args) {

        int itemCode = 003;
        switch (itemCode) {
            case 001 -> System.out.println("Item Electronics");
            case 002 -> System.out.println("Item Men's Fashion");
            case 003 -> System.out.println("Item Men's Footwear");
            default -> System.out.println("No Match");
        }
    }
}
