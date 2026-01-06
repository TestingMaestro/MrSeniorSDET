package Z_practice_revision_others.ex_z_practiceprograms;

public class Exc27Anagram {
    static void main(String[] args) {

        String s1 = "eat";
        String s2 = "tea";

        // for case-sensitivity check //s checks if any extra characters,spaces or hidden characters are present
        // if either in s1 or s2 any of the character is capital ex" s1 = "eat" and s2 = "Tea"
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        StringBuilder temp = new StringBuilder(s2);

        //Quick Length check -  Length of the strings equality

        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i); // starting from  i = 0
            int index = temp.indexOf(String.valueOf(ch)); // Converts character to String

            if (index == -1) { // if and index goes out of range or element is not found at the index
                System.out.println("Not an Anagram");
            }
            temp.deleteCharAt(index); // if element is found or matches remove the element
        }
        System.out.println("Anagram");

    }

}
