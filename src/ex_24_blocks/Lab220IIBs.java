package ex_24_blocks;

public class Lab220IIBs {
    static void main(String[] args) {
        new Lab220IIBs();
        System.out.println("Main Method");

    }

    {
        System.out.println("Im and iib 1");
    }
    static {
        System.out.println("Im SIB ");
    }
    {
        System.out.println("Im and iib 1");
    }

    Lab220IIBs() {
        System.out.println("Default constructor");
    }

}
