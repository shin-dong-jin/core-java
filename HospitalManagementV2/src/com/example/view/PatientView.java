package com.example.view;

import com.example.controller.patient.*;
import com.example.model.PatientVO;

import java.util.List;

public class PatientView {
    private InsertController insertController;
    private ReadController readController;
    private ReadAllController readAllController;
    private UpdateController updateController;
    private DeleteController deleteController;
    private ConsoleView consoleView;

    public PatientView() {
        insertController = new InsertController();
        readController = new ReadController();
        readAllController = new ReadAllController();
        updateController = new UpdateController();
        deleteController = new DeleteController();
        consoleView = new ConsoleView();

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
//                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame().getComponent(0), "잘못된 번호를 입력하셨습니다.");
                    consoleView.wrongChoice();
            }
        }
    }

    private void insertMenu() {
        PatientVO patient = consoleView.insert();
        consoleView.viewInsertResult(insertController.insert(patient));
    }

    private void readMenu() {
        int patientNumber = consoleView.read();
        PatientVO patient = readController.read(patientNumber);
        consoleView.viewReadResult(patient);
    }

    private void readAllMenu() {
        List<PatientVO> patients = readAllController.readAll();
        consoleView.readAll();
        consoleView.viewReadAllResult(patients);
    }

    private void updateMenu() {
        PatientVO patient = consoleView.update();
        new CalcController(patient);
        consoleView.viewUpdateResult(updateController.update(patient));
    }

    private void deleteMenu() {
        int patientNumber = consoleView.delete();
        consoleView.viewDeleteResult(deleteController.delete(patientNumber));
    }

    private int showMenu() {
        int choice = consoleView.start();
        consoleView.newLine();
        return choice;
    }
}
