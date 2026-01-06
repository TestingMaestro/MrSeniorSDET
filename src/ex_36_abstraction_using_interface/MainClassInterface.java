package ex_36_abstraction_using_interface;

public class MainClassInterface {
    static void main(String[] args) {

        Payment p1 = new UpiPayment();
        Payment p2 = new AmazonPay();
        Payment p3 = new CreditCardPayment();
        p1.pay();
        p2.pay();
        p3.pay();
        p2.paymentFailure();


    }

}
