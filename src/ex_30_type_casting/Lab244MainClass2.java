package ex_30_type_casting;

public class Lab244MainClass2 {
    static void main(String[] args) {

        Demo1 d1 = new Demo3();
        d1.s1();
        Demo3 d3 = (Demo3) d1;
        d3.s2();
        d3.s3();
    }
}
