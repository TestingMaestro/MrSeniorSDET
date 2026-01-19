package ex_39_enumeration;

public enum Colors {
    RED("#0098H"),
    BLUE("999UH"),
    WHITE("0000");

    private String myColors;

    Colors(String myColors) {
        this.myColors = myColors;
    }

    public String getMyColors() {
        return myColors;
    }
}
