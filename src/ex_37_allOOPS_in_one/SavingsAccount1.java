package ex_37_allOOPS_in_one;

public class SavingsAccount1 implements BankRules1{

    @Override
    public void withdraw(double amount)
    {
        System.out.println("Withdrawn "+amount+" from savings");
    }

    //Optional to override
    @Override
    public void checkBalance() {
        System.out.println("Checking balance from savings account");
    }

}
