package Z_practice_revision_others.daily_practice_oops_concepts.banking;

abstract public class BankAccount implements InterestPolicy {

    public String accountHolderName;
    private double balance;

    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    abstract public void calculateInterest();
}
