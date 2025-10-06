package ex_06_TypeCasting;

public class Lab072CharacterConversion {
    static void main(String[] args) {

        char c = 'A';

        // Widening
        int asciiValueConversion = c;
        System.out.println(asciiValueConversion);

        // Narrowing

        int c1 = 90;
        char c2 = (char) c1;
        System.out.println(c2);
    }
}
