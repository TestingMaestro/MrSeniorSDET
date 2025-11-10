package ex_14_switchStatement;

public class Lab131MultipleCasesInSameLineNewSwitch {
    static void main(String[] args) {

        int itemCode = 003;
        switch (itemCode) {
            case 000, 001, 002 -> System.out.println("Electronic Gadgets");
            case 003, 005 -> System.out.println("Fashion");
            default -> System.out.println("Error");
        }
    }
}
