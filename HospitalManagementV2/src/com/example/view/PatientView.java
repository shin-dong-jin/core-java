package com.example.view;

import com.example.controller.patient.*;
import com.example.model.PatientVO;

import java.util.List;

public class PatientView {
    private ConsoleView consoleView;

    public PatientView(ConsoleView consoleView) {
        this.consoleView = consoleView;

        Outer: while (true) {
            switch (showMenu()) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    readMenu();
                    break;
                case 3:
                    readAllMenu();
                    break;
                case 4:
                    updateMenu();
                    break;
                case 5:
                    deleteMenu();
                    break;
                case 99:
                    consoleView.terminateProgram();
                    consoleView.closeReader();
                    consoleView.closeWriter();
                    break Outer;
                default:
                    consoleView.wrongChoice();
            }
        }
    }

    private void insertMenu() {
        InsertController insertController = new InsertController();
        PatientVO patient = consoleView.insert();
        consoleView.viewInsertResult(insertController.insert(patient));
    }

    private void readMenu() {
        ReadController readController = new ReadController();
        int patientNumber = consoleView.read();
        PatientVO patient = readController.read(patientNumber);
        consoleView.viewReadResult(patient);
    }

    private void readAllMenu() {
        ReadAllController readAllController = new ReadAllController();
        List<PatientVO> patients = readAllController.readAll();
        consoleView.readAll();
        consoleView.viewReadAllResult(patients);
    }

    private void updateMenu() {
        UpdateController updateController = new UpdateController();
        PatientVO patient = consoleView.update();
        new CalcController(patient);
        consoleView.viewUpdateResult(updateController.update(patient));
    }

    private void deleteMenu() {
        DeleteController deleteController = new DeleteController();
        int patientNumber = consoleView.delete();
        consoleView.viewDeleteResult(deleteController.delete(patientNumber));
    }

    private int showMenu() {
        int choice = consoleView.start();
        consoleView.newLine();
        return choice;
    }
}
