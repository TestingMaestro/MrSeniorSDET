package Z_practice_revision_others.daily_practice_oops_concepts.banking;

public class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No ROI, show balance" + getBalance());
    }

    public double getRateOfInterest() {
        return getBalance();
    }

    @Override
    public void createAccount() {

        System.out.println("Current Account is created for " + getAccountHolderName());
        System.out.println("No ROI: Showing Balance: "+ getRateOfInterest());
    }
}
