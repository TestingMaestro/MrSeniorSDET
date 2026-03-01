package A0_revision.ObjectOrientedProgramming.Encapsulation;

public class Login {
    String userName;
    private String password;
    boolean isAdmin;

    Login(String userName, String password, boolean isAdmin) {
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUserName(String userName) {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (password.length() >= 8 && isAdmin) {
            System.out.println("Login Successful");
            this.password = password;
        } else System.out.println("Failed to Login! Try again");

    }

    public String getUserName() {
        return userName;
    }
}
