package ch11corejava.enumtype;

public enum Coin {
    PENNY(1, "COPPER"), NICKEL(5, "NICKEL"), DIME(10, "SILVER"), QUARTER(25, "SILVER");

    private final int CENTS;
    private final String COLOR;

    Coin(int CENTS, String COLOR) {
        this.CENTS = CENTS;
        this.COLOR = COLOR;
    }
}
