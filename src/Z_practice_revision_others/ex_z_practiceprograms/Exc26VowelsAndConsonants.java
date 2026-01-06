package Z_practice_revision_others.ex_z_practiceprograms;

import java.util.Scanner;

public class Exc26VowelsAndConsonants {
    static void main(String[] args) {

        int vowels = 0;
        int cons = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            } else cons = cons + 1;
        }
        System.out.println("Number Of vowels" + vowels);
        System.out.println("Number Of consonants" + cons);
    }
}
