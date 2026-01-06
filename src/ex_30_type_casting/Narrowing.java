package ex_30_type_casting;

public class Narrowing {
    static void main(String[] args) {

        //only explicit

        double b = 10.22;
        float q = (float) b;

        byte l = (byte) 100000000000000l;

        float f = (float) 10.3452;

        int x = 100;
        byte g = (byte) x;

        char ch = 65;

        char num = (char) 65;
        System.out.println(num);


        char ch1 = 'M';
        int um = (int) ch1;
        System.out.println(um);
    }
}
