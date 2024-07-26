package com.example.view;

import com.example.controller.*;
import com.example.model.PatientVO;

import java.util.List;

public class PatientView {
    private InsertController insertController;
    private ReadController readController;
    private ReadAllController readAllController;
    private UpdateController updateController;
    private DeleteController deleteController;
    private Reader reader;
    private Writer writer;

    public PatientView() {
        insertController = new InsertController();
        readController = new ReadController();
        readAllController = new ReadAllController();
        updateController = new UpdateController();
        deleteController = new DeleteController();
        reader = new ConsoleReader();
        writer = new ConsoleWriter();

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
                    break Outer;
                default:
//                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame().getComponent(0), "잘못된 번호를 입력하셨습니다.");
                    writer.println("잘못된 번호를 입력하셨습니다.");
            }
        }

        reader.close();
        writer.close();
    }

    private void insertMenu() {
        writer.println("[환자 등록 메뉴]");
        writer.print("환자 등록 번호: ");
        int number = reader.nextInt();
        writer.print("진료 코드: ");
        String code = reader.next();
        writer.print("입원 일수: ");
        int days = reader.nextInt();
        writer.print("환자 나이: ");
        int age = reader.nextInt();

        PatientVO patient = new PatientVO(number, code, days, age);
        if (insertController.insert(patient)) {
            writer.println("환자 등록 성공");
        } else {
            writer.println("환자 등록 실패");
        }
        writer.println();
    }

    private void readMenu() {
        writer.println("[환자 검색 메뉴]");
        writer.print("환자 등록 번호: ");
        int patientNumber = reader.nextInt();
        PatientVO patient = readController.read(patientNumber);

        if(patient == null) {
            writer.println("환자 조회 실패");
        } else {
            writer.println(patient.getNumber() + "번 환자 조회 결과");
            writer.println("진료 코드: " + patient.getCode());
            writer.println("입원 일수: " + patient.getDays());
            writer.println("환자 나이: " + patient.getAge());
            writer.println("진찰부서: " + patient.getDept());
            writer.println("진찰비: " + patient.getOperFee());
            writer.println("입원비: " + patient.getHospitalFee());
            writer.println("진료비: " + patient.getMoney());
        }
        writer.println();
    }

    private void readAllMenu() {
        writer.println("[환자 목록 메뉴]");
        List<PatientVO> patients = readAllController.readAll();

        if (patients == null) {
            writer.println("목록 조회 실패");
        } else {
            writer.println("번호\t진찰부서\t진찰비\t입원비\t진료비");
            StringBuilder builder = new StringBuilder();
            for(PatientVO patient : patients) {
                builder.append(patient.getNumber()).append("\t\t")
                                .append(patient.getDept()).append("\t\t")
                                .append(patient.getOperFee()).append("\t")
                                .append(patient.getHospitalFee()).append("\t")
                                .append(patient.getMoney()).append("\n");
            }
            writer.println(builder);
        }
        writer.println();
    }

    private void updateMenu() {
        writer.println("[환자 수정 메뉴]");
        writer.print("환자 등록 번호: ");
        int patientNumber = reader.nextInt();
        writer.print("진료 코드: ");
        String code = reader.next();
        writer.print("입원 일수: ");
        int days = reader.nextInt();
        writer.print("환자 나이: ");
        int age = reader.nextInt();

        PatientVO patient = new PatientVO(patientNumber, code, days, age);
        new CalcController(patient);
        if(updateController.update(patient)) {
            writer.println("환자 수정 성공");
        } else {
            writer.println("환자 수정 실패");
        }
        writer.println();
    }

    private void deleteMenu() {
        writer.println("[환자 삭제 메뉴]");
        writer.print("환자 등록 번호: ");
        int patientNumber = reader.nextInt();
        
        if(deleteController.delete(patientNumber)) {
            writer.println("환자 삭제 성공");
        } else {
            writer.println("환자 삭제 실패");
        }
        writer.println();
    }

    private int showMenu() {
        writer.println("                    ┌----------------------------------------┐");
        writer.println("                    │    새싹 정형외과 환자 관리 프로그램    │");
        writer.println("                    └----------------------------------------┘");
        writer.print("1. 환자 등록  ");
        writer.print("2. 환자 검색  ");
        writer.print("3. 환자 목록  ");
        writer.print("4. 환자 수정  ");
        writer.print("5. 환자 삭제  ");
        writer.println("99. 프로그램 종료");
        writer.println("========================================================================================");
        writer.print("원하시는 메뉴 번호를 선택해 주세요>> ");
        int choice = reader.nextInt();
        writer.println();
        return choice;
    }
}
