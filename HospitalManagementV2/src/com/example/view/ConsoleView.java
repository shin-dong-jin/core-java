package com.example.view;

import com.example.controller.console.ConsoleReader;
import com.example.controller.console.ConsoleWriter;
import com.example.controller.console.Reader;
import com.example.controller.console.Writer;
import com.example.model.PatientVO;
import com.example.utils.MessageBuilder;

import java.util.List;

public class ConsoleView {
    private Writer writer;
    private Reader reader;

    public ConsoleView() {
        writer = new ConsoleWriter();
        reader = new ConsoleReader();
    }

    public int start() {
        writer.print(MessageBuilder.getStartMenu());
        return reader.nextInt();
    }

    public PatientVO insert() {
        String[] insertMessages = MessageBuilder.getInsertMenu();
        writer.println(insertMessages[0]);
        writer.print(insertMessages[1]);
        int number = reader.nextInt();
        writer.print(insertMessages[2]);
        String code = reader.next();
        writer.print(insertMessages[3]);
        int days = reader.nextInt();
        writer.print(insertMessages[4]);
        int age = reader.nextInt();

        return new PatientVO(number, code, days, age);
    }

    public void viewInsertResult(boolean insert) {
        String[] resultMessages = MessageBuilder.getInsertResult();
        if (insert) {
            writer.println(resultMessages[0]);
            writer.println();
            return;
        }
        writer.println(resultMessages[1]);
        writer.println();
    }

    public int read() {
        String[] readMessages = MessageBuilder.getReadMenu();
        writer.println(readMessages[0]);
        writer.print(readMessages[1]);
        return reader.nextInt();
    }

    public void viewReadResult(PatientVO patient) {
        String[] readMessages = MessageBuilder.getReadResult();
        if (patient == null) {
            writer.println(readMessages[0]);
            writer.println();
            return;
        }
        writer.println(patient.read());
        writer.println();
    }

    public void readAll() {
        String[] readAllMessages = MessageBuilder.getReadAllMenu();
        writer.println(readAllMessages[0]);
    }

    public void viewReadAllResult(List<PatientVO> patients) {
        String[] readAllMessages = MessageBuilder.getReadAllResult();
        if (patients == null) {
            writer.println(readAllMessages[1]);
            writer.println();
            return;
        }
        writer.println(readAllMessages[0]);
        StringBuilder builder = new StringBuilder();
        for (PatientVO patient : patients) {
            patient.readAll(builder);
        }
        writer.println(builder);
        writer.println();
    }

    public PatientVO update() {
        String[] updateMessages = MessageBuilder.getUpdateMenu();
        writer.println(updateMessages[0]);
        writer.print(updateMessages[1]);
        int number = reader.nextInt();
        writer.print(updateMessages[2]);
        String code = reader.next();
        writer.print(updateMessages[3]);
        int days = reader.nextInt();
        writer.print(updateMessages[4]);
        int age = reader.nextInt();
        return new PatientVO(number, code, days, age);
    }

    public void viewUpdateResult(boolean update) {
        String[] updateMessages = MessageBuilder.getUpdateResult();
        if (update) {
            writer.println(updateMessages[0]);
            writer.println();
            return;
        }
        writer.println(updateMessages[1]);
        writer.println();
    }

    public int delete() {
        String[] deleteMessages = MessageBuilder.getDeleteMenu();
        writer.println(deleteMessages[0]);
        writer.print(deleteMessages[1]);
        return reader.nextInt();
    }

    public void viewDeleteResult(boolean delete) {
        String[] deleteMessages = MessageBuilder.getDeleteResult();
        if (delete) {
            writer.println(deleteMessages[0]);
            writer.println();
            return;
        }
        writer.println(deleteMessages[1]);
        writer.println();
    }

    public void wrongChoice() {
        writer.println(MessageBuilder.getWrongChoice());
    }

    public void terminateProgram() {
        writer.println(MessageBuilder.getProgramOver());
    }

    public void newLine() {
        writer.println();
    }

    public void closeWriter() {
        writer.close();
    }

    public void closeReader() {
        reader.close();
    }
}
