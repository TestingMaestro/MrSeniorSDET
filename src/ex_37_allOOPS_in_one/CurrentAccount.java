package ex_37_allOOPS_in_one;

public class CurrentAccount extends BankAccount {

    private static final double OVERDRAFT_AMOUNT = 5000;

    CurrentAccount(String accHolderName, double initialAmount) {
        super(accHolderName, initialAmount);
    }

    @Override
    public void withdrawAmount(int drawAmount) {
        if (getBalance() + OVERDRAFT_AMOUNT >= drawAmount) {
            setBalance(getBalance() - drawAmount);
            System.out.println("Current withdrawal successful (overdraft allowed)");
        } else System.out.println("Current Account: Overdraft limit exceeded");
    }

    @Override
    public void createAccount() {
        System.out.println("Current Account Created for: " +getAccountHolder());
    }
}
