package ex_24_blocks;

public class Lab219SIBs {

    /*
    * Why static blocks are useful in Selenium?
      They run once per class
      They are perfect for one-time setup
      They help in loading configs, drivers, excel, logs before tests start
      They avoid duplicate code
      * */
    static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("I'm SIB 1");
    }

    static {
        System.out.println("I'm SIB 2");
    }
}
