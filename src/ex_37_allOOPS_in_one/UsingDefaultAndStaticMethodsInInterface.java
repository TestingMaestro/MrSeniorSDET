package ex_37_allOOPS_in_one;

public class UsingDefaultAndStaticMethodsInInterface {

    static void main(String[] args) {

        BankRules1 savingsAccount1 = new SavingsAccount1();
        savingsAccount1.withdraw(5000);
        savingsAccount1.checkBalance();

        BankRules1.bankInfo();
    }
}
