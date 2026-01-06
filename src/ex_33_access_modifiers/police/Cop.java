package ex_33_access_modifiers.police;

import ex_33_access_modifiers.criminal.Hacker;

public class Cop extends Hacker {

    private int bullet;
    String iCard;

    public Cop(int bullet) {
        this.bullet = bullet;
        super(12);
    }

    protected void canIShoot() {
        System.out.println("yes you can shoot");
    }

    void textMessage() {
        System.out.println("Default access modifier");
    }

    static void main(String[] args) {

        Cop cp = new Cop(100);
        cp.canIShoot();
        System.out.println(cp.stealMoney);
        cp.catchHacker();
    }
}
