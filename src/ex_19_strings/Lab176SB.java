package ex_19_strings;

public class Lab176SB {
    static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Yashodhar");
        stringBuffer.append(" Karki`");
        System.out.println(stringBuffer);
        int cap = stringBuffer.capacity();
        System.out.println(cap);
    }
}
