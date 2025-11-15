package ex_19_strings;

public class Lab175StringBuilderVsStringBuffer
{
    static void main(String[] args) {

        String s1 = "Yash";
        String s2 = new String("Yash");

        StringBuilder sb1 = new StringBuilder("Yash");
        StringBuffer sb2 = new StringBuffer ("Yash");
    }
}
