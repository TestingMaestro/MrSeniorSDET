package ex_31_Encapsulation;

public class MainClassVWO {
    static void main(String[] args) {

        VWOLogin vl = new VWOLogin("username", "password");
        vl.setUserEmail("yashodhar.karkii@gmail.com");
        vl.pass();

        System.out.println(vl.getPassword());
    }
}
