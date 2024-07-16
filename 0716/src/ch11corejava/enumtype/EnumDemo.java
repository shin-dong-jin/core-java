package ch11corejava.enumtype;

public class EnumDemo {
    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println(season.ordinal());
        System.out.println(season.getVALUE());
    }
}
