package ex_31_Encapsulation;

public class Lab253EncapsulationDemoYt {
    static void main(String[] args) {

        YoutubeLogin yt = new YoutubeLogin("yash", "1234");
        yt.setUserName("yashodhar");
        yt.setPassword("Str234", true);

        System.out.println(yt.getPassword());
      /*  yt.password = "456";
        System.out.println(yt.password); // Direct modification hacked - no restricted access data can be stolen*/
    }
}
