package ex_37_allOOPS_in_one;

public class BankDemo {
    static void main(String[] args) {

/*        Implementation is hidden from users better to upcast to Interface type instead of BankAccount --> Use BankRules
        Client depends on rules rather than implementation

        USE BankRules for maximum polymorphism

        BankAccount savingsAccount = new SavingsAccount("Yash", 5000);
        BankAccount currentAccount = new CurrentAccount("Sou", 2000);*/

        BankRules savingsAccount = new SavingsAccount("Yash", 5000);
        BankRules currentAccount = new CurrentAccount("Sou", 2000);

        savingsAccount.createAccount();
        savingsAccount.withdrawAmount(501);
        System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());

        savingsAccount.depositAmount(10000);
        System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());


        currentAccount.createAccount();
        currentAccount.withdrawAmount(3000);
        System.out.println("Current Account Balance:" + currentAccount.checkBalance());

    }
}
