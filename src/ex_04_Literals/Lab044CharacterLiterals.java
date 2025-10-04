package ex_04_Literals;

public class Lab044CharacterLiterals {
    static void main(String[] args) {

        char b = 'A';
        char c = ' ';
        char d = '{';
        char e = '9';
        char f = '(';
        char g = ')';

        char smiley = '\uD83D';
        String smiley1 = "\uD83D\uDE00";
        String smiley2 = "\uD83D\uDE42";

        //default value = '\u0000'-> Unicode
        //ASCII value
        System.out.println(smiley2);

    }
}
