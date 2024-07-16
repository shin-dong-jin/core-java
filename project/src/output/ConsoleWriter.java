package output;

import utils.Console;

public class ConsoleWriter {

    public void println(Object object) {
        Console.println(object);
    }

    public void print(Object object) {
        Console.print(object);
    }

    public void close() {
        Console.printStreamClose();
    }
}
