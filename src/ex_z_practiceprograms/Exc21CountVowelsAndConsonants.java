package ex_z_practiceprograms;

public class Exc21CountVowelsAndConsonants {
    static void main(String[] args) {
        String input = "My name is yash, the coder";

        input = input.toLowerCase();
        countVowelsAndConsonants(input);
    }

    private static void countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            } else consonants = consonants + 1;
        }
        System.out.println("Number of Vowels " + vowels);
        System.out.println("Number of Consonants " + consonants);

    }
}
