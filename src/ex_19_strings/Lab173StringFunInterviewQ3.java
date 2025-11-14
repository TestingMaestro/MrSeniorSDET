package ex_19_strings;

public class Lab173StringFunInterviewQ3 {
    static void main(String[] args) {

        String str1 = "Yash";
        String str2 = "Yash";

        String str3 = new String("Yash");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
