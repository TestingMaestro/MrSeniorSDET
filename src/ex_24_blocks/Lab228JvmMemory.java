package ex_24_blocks;

public class Lab228JvmMemory {
    static int x = 20;

    static void test() {
        System.out.println("Running test");
    }

    static void disp() {
        test();
    }

    void run() {
        disp();
    }

    static void main(String[] args) {
        Lab228JvmMemory jv = new Lab228JvmMemory();
        jv.run();
    }
}
