package ex_33_access_modifiers.criminal;

import ex_33_access_modifiers.police.JrCop;

public class Hacker extends JrCop
{
    protected int stealMoney = 5000;

    public Hacker(int bullet)
    {
        super(20);
    }

    protected void catchHacker()
    {
        System.out.println("Catch the hacker");
    }

    static void main(String[] args) {

        Hacker hc = new Hacker(100);
        hc.canIShoot();

    }
}
