package Z_practice_revision_others.ex_z_practiceprograms;

public class ExecMStringPalindrome
{
    static void main(String[] args) {

        String pali = "naman";
        boolean flag = true;
        for (int i = 0; i < pali.length(); i++) {
            if(pali.charAt(i) == pali.charAt(pali.length()-i-1))
            {
                flag = false;
            }
        }
        if(! flag)
        {
            System.out.println("Palindrome");
        }
        else System.out.println("Not a Palindrome");
    }
}
