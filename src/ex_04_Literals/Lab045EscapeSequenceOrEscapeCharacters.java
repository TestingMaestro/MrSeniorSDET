package ex_04_Literals;

public class Lab045EscapeSequenceOrEscapeCharacters {
    static void main(String[] args) {

        char newLine = '\n'; // Next line
        char tabLine = '\t'; // tab space
        char backSpace = '\b'; // deletes single character [Previous]
        char carriageReturn = '\r'; // deletes First Word
        char backSlash = '\\';
        char singleQuoteCharacter = '\'';
        char doubleQuoteCharacter = '\"';


        System.out.println("Yashodhar " + newLine + "Karki");
        System.out.println("Yashodhar " + tabLine + "Karki");
        System.out.println("Yashodhar " + backSpace + "Karki");
        System.out.println("Yashodhar " + carriageReturn + "Karki");
        System.out.println("\" Yashodhar\" Karki");
        System.out.println("\' Yashodhar\' Karki");
        System.out.println("\\ Yashodhar\\ Karki");

        char asciiValueOfA = 68;
        System.out.println(asciiValueOfA);
    }
}
