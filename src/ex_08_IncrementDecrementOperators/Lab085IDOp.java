package ex_08_IncrementDecrementOperators;

public class Lab085IDOp {
    static void main(String[] args) {

        // Pre - increment --> ++operand
        // Value will be first incremented by 1 and then stored in the result

        int a = 20; // a -> 20
        int b = ++a; // b -> ++20 -> 21 --> incremented first then stored in b
        System.out.println(b); // b -> 21
        System.out.println(a); // a -> 21

        // Exp and Result table
        // Line No | a | Result b
        //8 | 20 | NA
        //9 | 21 | 21
        //10 | 21 | 21
        //11 | 21 | 21 (NA)
    }
}
