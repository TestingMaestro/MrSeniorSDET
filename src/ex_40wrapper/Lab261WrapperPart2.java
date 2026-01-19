package ex_40wrapper;

public class Lab261WrapperPart2 {

    static void main(String[] args) {

        //String to Wrapper -> parseX

        Integer a11 = new Integer(10);
        String x = a11.toString();
        int a12 = a11.intValue();

        String num = "20";
        System.out.println(Integer.parseInt(num));
        System.out.println(Double.parseDouble(num));

        char a = 'A';
        System.out.println((int)a);

        int a3 = 67;
        char aa = (char)a3;
        System.out.println(aa);

        //Wrapper to String method 1

        Integer a1 = 90;
        String wrapper = String.valueOf(a1);
        System.out.println(wrapper + " mynum");

        //Wrapper to String Method 2

        String s2 = a1.toString();
        System.out.println(s2);

    }
}
