package ch11corejava.enumtype;

/**
 * @author shin-dong-jin
 * @version 1.0.0
 * @since jdk 17
 */
// javadoc: javadoc -d [위치] Season.java
public enum Season {
    SPRING(5), SUMMER(100), FALL(1_000), WINTER(30_000_000);

    private final int VALUE;
    Season(int VALUE) {
        this.VALUE = VALUE;
    }

    public int getVALUE() {
        return this.VALUE;
    }
}
