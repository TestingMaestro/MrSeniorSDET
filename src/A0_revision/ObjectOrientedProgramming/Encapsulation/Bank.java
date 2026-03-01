package A0_revision.ObjectOrientedProgramming.Encapsulation;

public class Bank {
    private double balance;

    Bank(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

}
