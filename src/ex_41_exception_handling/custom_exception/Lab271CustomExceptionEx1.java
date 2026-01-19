package ex_41_exception_handling.custom_exception;

public class Lab271CustomExceptionEx1 {
    static void main(String[] args) { //or use try/catch

        Bank icici = new Bank("INR", 100);
        Bank sbi = new Bank("INR", 200);
        Bank jp_chase = new Bank("USD", 221);
//        int total = sbi.add(icici);

        int total2 = 0;
        try {
            total2 = sbi.add(jp_chase);
        } catch (CurrencyMissMatchCustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(total2);

    }
}

class Bank {

    private String currency;
    private Integer amount;

    Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bank) throws CurrencyMissMatchCustomException{
        if (bank.currency.equalsIgnoreCase("INR"))
        {
            return bank.amount + this.amount;
        }
        else throw new CurrencyMissMatchCustomException("Currency MissMatch");
    }
}
class CurrencyMissMatchCustomException extends Exception{
    CurrencyMissMatchCustomException(String msg){
        super(msg);
    }
}