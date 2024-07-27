package com.example.controller.console;

import com.example.model.Console;

public class ConsoleWriter implements Writer {

    @Override
    public void println(Object object) {
        Console.println(object);
    }

    @Override
    public void println() {
        Console.println();
    }

    @Override
    public void print(Object object) {
        Console.print(object);
    }

    @Override
    public void close() {
        Console.closeOutput();
    }
}
