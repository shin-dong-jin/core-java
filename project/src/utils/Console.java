package utils;

public class Console {
    private static java.util.Scanner scanner;
    private static java.io.PrintStream printStream;

    private Console() {

    }

    public static String readLine() {
        return getScannerInstance().nextLine();
    }

    public static String read() {
        return getScannerInstance().next();
    }

    public static int nextInt() {
        return getScannerInstance().nextInt();
    }

    public static void println(Object object) {
        getPrintStreamInstance().println(object);
    }

    public static void printf(String format, Object... args) {
        getPrintStreamInstance().printf(format, args);
    }

    public static void print(Object object) {
        getPrintStreamInstance().print(object);
    }

    private static java.util.Scanner getScannerInstance() {
        if (scanner == null) {
            scanner = new java.util.Scanner(System.in);
        }
        return scanner;
    }

    private static java.io.PrintStream getPrintStreamInstance() {
        if (printStream == null) {
            printStream = new java.io.PrintStream(System.out);
        }
        return printStream;
    }

    public static void scannerClose() {
        if(scanner == null) {
            return;
        }
        scanner.close();
    }

    public static void printStreamClose() {
        if (printStream == null) {
            return;
        }
        printStream.close();
    }
}