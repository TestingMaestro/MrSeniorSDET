package ex_40wrapper;

public class OldPhone implements SimCard
{
    void calling()
    {
        System.out.println("dial pad Phone");
    }

    @Override
    public void enterCard()
    {
        System.out.println("Card Entered");
    }
}
