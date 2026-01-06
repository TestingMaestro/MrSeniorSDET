package Z_practice_revision_others.ex_z_practiceprograms;

import java.util.Scanner;

public class Exc14TaskTriangleClassifier {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1. side2 and side 3");
        if (sc.hasNextInt()) {
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();
            triangleClassifier(side1, side2, side3);
        } else System.out.println("Enter valid numbers only");
    }

    static void triangleClassifier(int side1, int side2, int side3) {
        if ((side1 == side2) && (side2 == side3) && (side3 == side1)) {
            System.out.println("Equilateral");
        } else if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
