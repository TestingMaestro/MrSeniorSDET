package A0_revision.D_wrapperclass;

public class Wrapper2AllInOne {

    static void main(String[] args) {

        // Boxing
        int a = 10;
        Integer obj = a;

        // Unboxing
        Integer b = 20;
        int num = b;

        // String → int (Parsing)
        String s1 = "30";
        int x = Integer.parseInt(s1);

        // String → Integer
        String s2 = "40";
        Integer y = Integer.valueOf(s2);

        // int → String
        int z = 50;
        String s3 = String.valueOf(z);

        // Integer → String
        Integer k = 60;
        String s4 = k.toString();
    }
}
