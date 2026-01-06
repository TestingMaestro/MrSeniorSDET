package Z_practice_revision_others.ex_z_practiceprograms;

public class ExcZStringPalindrome {
    static void main(String[] args) {
        stringPalindrome("naman");
    }

    static boolean flag = true;
    static void stringPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {

            System.out.println("String palindrome");
        } else System.out.println("String is not palindrome");
    }
}
