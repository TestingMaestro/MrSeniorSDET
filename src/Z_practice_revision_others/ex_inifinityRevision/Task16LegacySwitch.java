package Z_practice_revision_others.ex_inifinityRevision;

import java.util.Scanner;

public class Task16LegacySwitch {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("FCD");
                break;
            case 'B':
                System.out.println("FC");
                break;
            default:
                System.out.println("No grade hogalle");
        }
    }
}
