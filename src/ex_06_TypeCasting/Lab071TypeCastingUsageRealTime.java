package ex_06_TypeCasting;

public class Lab071TypeCastingUsageRealTime {
    static void main(String[] args) {

        int schoolFees = 200;
        float GST = 18.47F;

//        int totaValue1 = schoolFees + GST; // Implicit not allowed in case of Narrowing

        // Explicitly we need to specify
        // Narrowing
        int totalValue1 = schoolFees + (int) GST;
        System.out.println(totalValue1); // 0.47 Data loss

        // To Solve this problem use Bigger data type
        // Widening
        double totalValue2 = schoolFees + GST;
        System.out.println(totalValue2);
    }
}
