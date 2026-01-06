package ex_37_allOOPS_in_one;

public interface BankRules {
    void createAccount();

    void depositAmount(int amount);

    void withdrawAmount(int drawAmount);

    double checkBalance();
}

abstract class BankAccount implements BankRules {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void depositAmount(int amount) {
        balance = balance + amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
    abstract public void withdrawAmount(int drawAmount);
}
