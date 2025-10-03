package ex_03_javaBasicsPart3;

import java.util.Date;

public class Lab032DateandTimePlaceholder {
    static void main(String[] args) {

        Date date = new Date();
        System.out.println(String.format("Today's date is %tD", date));
        System.out.println(String.format("Today's time is %tT", date));
    }
}
