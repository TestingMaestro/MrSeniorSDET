package ex_39_enumeration;

public enum Locators
{
    LOGINBUTTON("#LoginBtn"),
    REMEMBERPASSWORDCHECKBOX("#checkbox"),
    USERNAME("#usrname_id");

    private String locators;

    Locators(String locators)
    {
        this.locators = locators;
    }

    public String getLocators() {
        return locators;
    }
}
