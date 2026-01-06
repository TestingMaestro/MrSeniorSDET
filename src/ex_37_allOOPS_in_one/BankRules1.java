package ex_37_allOOPS_in_one;

public interface BankRules1 {
    void withdraw(double amount);

    default void checkBalance() {
        System.out.println("Checking balance is available");
    }

    static void bankInfo() {
        System.out.println("All must follow bank rules");
    }
}
