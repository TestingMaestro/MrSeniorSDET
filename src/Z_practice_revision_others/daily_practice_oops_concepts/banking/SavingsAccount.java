package Z_practice_revision_others.daily_practice_oops_concepts.banking;

public class SavingsAccount extends BankAccount {
    protected double rateOfInterest;

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        rateOfInterest = (getBalance() * rateOfInterest) / 365;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public void createAccount() {

        System.out.println("Savings Account is created for "+ getAccountHolderName());
        System.out.println("ROI: "+getRateOfInterest());
    }
}
