package Z_practice_revision_others.daily_practice_oops_concepts.banking;

public class Banking
{
    static void main(String[] args) {

        InterestPolicy savingsAccount = new SavingsAccount("yashodhar", 5000);
        InterestPolicy currentAccount = new CurrentAccount("Sou", 6000);
        savingsAccount.createAccount();
        savingsAccount.calculateInterest();
        currentAccount.createAccount();
        currentAccount.calculateInterest();
    }
}
