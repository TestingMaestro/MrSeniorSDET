package ex_19_strings;

public class Lab172InterviewQ2 {
    static void main(String[] args) {

        String s1 = "Yash";
        String s2 = "yash";

        String s3 = new String("Yash");
        String s4 = new String("Yash");
        String s5 = new String("Yash");

        // == --> Compares the address
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s5);
        System.out.println(s1 == s5);
        System.out.println(s1 == s4);

        // .equals check the value

        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
