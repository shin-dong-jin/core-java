package productmanagement;

public class Reader {
    private final java.util.Scanner scanner;

    public Reader(String file) throws java.io.IOException {
        scanner = new java.util.Scanner(new java.io.File(file));
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
