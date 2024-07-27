package com.example.model;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private static Scanner scanner;
    private static PrintStream printStream;
    private static final InputStream inputStream = System.in;
    private static final OutputStream outputStream = System.out;

    private Console() {

    }

    public static String next() {
        return getInputInstance().next();
    }

    public static int nextInt() {
        return getInputInstance().nextInt();
    }

    public static void closeInput() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public static void println(Object object) {
        getOutputInstance().println(object);
    }

    public static void println() {
        getOutputInstance().println();
    }

    public static void print(Object object) {
        getOutputInstance().print(object);
    }

    public static void closeOutput() {
        if (printStream != null) {
            printStream.close();
        }
    }

    private static Scanner getInputInstance() {
        if (scanner == null) {
            scanner = new Scanner(inputStream);
        }
        return scanner;
    }

    private static PrintStream getOutputInstance() {
        if (printStream == null) {
            printStream = new PrintStream(outputStream);
        }
        return printStream;
    }
}
