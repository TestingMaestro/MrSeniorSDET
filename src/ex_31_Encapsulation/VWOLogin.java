package ex_31_Encapsulation;

public class VWOLogin {
    private String userEmail;
    private String password;

    public VWOLogin(String usEm, String pass) {
        this.userEmail = usEm;
        this.password = pass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else System.out.println("Wrong password");
    }
    public void pass()
    {
        this.setPassword("MT",true);
    }

}
