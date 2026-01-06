package ex_31_Encapsulation;

public class HDFCBank extends Bank {

    String username;
    private String password;
    private double balance;

    void connectingBanks()
    {
        System.out.println("HDFC Bank");
    }

    HDFCBank(String un, String password, double balance, double withdrawalAmount) {
        this.username = un;
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else System.out.println("Password is Wrong");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int withdrawalAmount) {
        if (withdrawalAmount <= balance) {
            this.balance = balance - withdrawalAmount;
        } else System.out.println("Withdrawal amount is greater than balance");
    }

    public void depositAmount(double amount) {
        this.balance = balance + amount;
    }
}
