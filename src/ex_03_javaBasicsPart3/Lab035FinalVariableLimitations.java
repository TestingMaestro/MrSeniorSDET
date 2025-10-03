package ex_03_javaBasicsPart3;

public class Lab035FinalVariableLimitations {

    static final double PI = 3.142; // Global Declaration-initialization
    //Not possible;
    // 2. static final double PI;

    static void main(String[] args) {

        // 1. PI = 7.2345; Cannot re-initialize throughout the Lifecycle of Var PI
        // 2. PI = 12.221;
    }
}
