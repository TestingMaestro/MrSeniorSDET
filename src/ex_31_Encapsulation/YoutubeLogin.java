package ex_31_Encapsulation;

public class YoutubeLogin {
    private String userName;
    private String password;

    YoutubeLogin(String un, String pwd) {
        this.userName = un;
        this.password = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else System.out.println("Wrong Password");
    }
}
