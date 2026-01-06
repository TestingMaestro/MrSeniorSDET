package ex_36_abstraction_using_interface;

public interface Payment {

    void pay();

    void paymentFailure();
}

class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }

    @Override
    public void paymentFailure() {
        System.out.println("Credit Card payment failure");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }

    @Override
    public void paymentFailure() {
        System.out.println("UPI payment failure");
    }
}

class AmazonPay implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using Amazon Pay");
    }

    @Override
    public void paymentFailure() {
        System.out.println("Amazon Pay got failure");
    }
}