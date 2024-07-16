package input;

import utils.Console;

public class ConsoleReader {

    public String readLine() {
        return Console.readLine();
    }

    public String read() {
        return Console.read();
    }

    public int nextInt() {
        return Console.nextInt();
    }

    public void close() {
        Console.scannerClose();
    }
}