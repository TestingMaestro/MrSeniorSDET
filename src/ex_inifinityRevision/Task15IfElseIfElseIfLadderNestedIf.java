package ex_inifinityRevision;

public class Task15IfElseIfElseIfLadderNestedIf {
    static void main(String[] args) {

        int pin = 1234;
        int balance = 23000;
        int withdrawalAmount = 89000;
        int addBalance = 7000;
        if (pin == 124)
        {
            if (withdrawalAmount < balance) {
                balance = balance - withdrawalAmount;
                System.out.println(balance);
            }  else if (withdrawalAmount > balance)
            {
                balance = balance + addBalance;
                System.out.println(balance);
            }
        }
        else System.out.println("Wrong pin");



    }

}
