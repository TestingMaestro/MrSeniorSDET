package ex_33_access_modifiers.police;

public class JrCop {

    private int bullet;
    String iCard;

    public JrCop(int bullet) {
        this.bullet = bullet;
    }

    protected void canIShoot() {
        System.out.println("yes you can shoot");
    }

    void textMessage() {
        System.out.println("Default access modifier");
    }
}
