package ex_inifinityRevision;

public class Task28DynamicText
{
    static void main(String[] args) {

        String s1 ="Welcome John-12345";
        String s2 = s1.replaceAll(s1,"12345");
        System.out.println(s2);
    }
}
