package ex_13_conditions;

public class Lab121NestedIf {
    static void main(String[] args) {

        int atmPin = 12346;
        int balance = 1000;
        int withDrawalAmt = 5000;

        if (atmPin == 1234) {
            if (withDrawalAmt < balance) {
                balance = balance - withDrawalAmt;
                System.out.println(balance);
            } else System.out.println("Warning!! Amount withdrawn is greater than balance");
        } else System.out.println("Wrong Pin!!! Pleas enter again");
    }
}
