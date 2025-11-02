package ex_000_practiceprograms;

public class Exc7CubeOfNumber {
    static void main(String[] args) {
        int cubeRoot1 = cubeOfNumber(40);
        System.out.println(cubeRoot1);
        int cubeRoot2 = cubeOfNumber(10);
        System.out.println(cubeRoot2);
    }

    static int cubeOfNumber(int a) {
        return a * a * a;
    }
}
