package ex_33_access_modifiers.criminal;

import ex_33_access_modifiers.police.Cop;

public class Thief
{
    static void main(String[] args) {

        Cop thief = new Cop(200);
        //thief.canIShoot();// in real world he cannot shoot
    }
}
