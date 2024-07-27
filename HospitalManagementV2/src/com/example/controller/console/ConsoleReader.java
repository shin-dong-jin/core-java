package com.example.controller.console;

import com.example.model.Console;

public class ConsoleReader implements Reader {
    @Override
    public int nextInt() {
        return Console.nextInt();
    }

    @Override
    public String next() {
        return Console.next();
    }

    @Override
    public void close() {
        Console.closeInput();
    }
}
