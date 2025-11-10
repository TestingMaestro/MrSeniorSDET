package ex_14_switchStatement;

public class Lab129SwitchInterview {
    static void main(String[] args) {
// Duplicate Cases are not allowed
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("ASCII value of A");
                break;
//            case 65:
//                System.out.println("ASCII value of A");
//                break;
            default:
                System.out.println("No Match");
        }
    }
}
