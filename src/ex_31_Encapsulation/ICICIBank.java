package ex_31_Encapsulation;

public class ICICIBank extends Bank {

    String username;
    private String password;
    private double balance;

    ICICIBank(String un, String password, double balance, double withdrawalAmount) {
        this.username = un;
        this.password = password;
        this.balance = balance;
    }
    void connectingBanks()
    {
        System.out.println("ICICI Bank");
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else System.out.println("Password is Wrong");
        return this.password;
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
