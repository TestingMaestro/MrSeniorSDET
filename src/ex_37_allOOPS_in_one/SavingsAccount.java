package ex_37_allOOPS_in_one;

public class SavingsAccount extends BankAccount {

    private static final double MIN_BALANCE = 1000;

    SavingsAccount(String accHolderName, double initialAmount) {
        super(accHolderName, initialAmount);
    }

    @Override
    public void withdrawAmount(int drawAmount) {
        if (getBalance() - drawAmount >= MIN_BALANCE) {
            setBalance(getBalance() - drawAmount);
            System.out.println("Successful Withdrawal");
        } else System.out.println("Savings Account: Minimum balance rule violated");
    }

    @Override
    public void createAccount() {
        System.out.println("Savings Account Created for: " + getAccountHolder());
    }
}
