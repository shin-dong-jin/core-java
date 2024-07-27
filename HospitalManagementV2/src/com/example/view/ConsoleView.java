package com.example.view;

public class ConsoleView {
    private Writer writer;
    private Reader reader;

    public ConsoleView() {
        writer = new ConsoleWriter();
        reader = new ConsoleReader();
    }

    public PatientView read() {}
}
