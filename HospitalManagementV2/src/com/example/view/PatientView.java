package com.example.view;

import com.example.controller.*;
import com.example.model.PatientVO;

import java.util.List;
import java.util.Scanner;

public class PatientView {
    private InsertController insertController;
    private ReadController readController;
    private ReadAllController readAllController;
    private UpdateController updateController;
    private Scanner scanner;

    public PatientView() {
        insertController = new InsertController();
        readController = new ReadController();
        readAllController = new ReadAllController();
        updateController = new UpdateController();
        scanner = new Scanner(System.in);
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
                    break;
                case 99:
                    break Outer;
                default:
//                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame().getComponent(0), "잘못된 번호를 입력하셨습니다.");
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
    }

    private void insertMenu() {
        System.out.println("환자 등록 메뉴");
        System.out.print("환자 등록 번호: ");
        int number = scanner.nextInt();
        System.out.print("진료 코드: ");
        String code = scanner.next();
        System.out.print("입원 일수: ");
        int days = scanner.nextInt();
        System.out.print("환자 나이: ");
        int age = scanner.nextInt();

        PatientVO patient = new PatientVO(number, code, days, age);
        if (insertController.insert(patient)) {
            System.out.println("환자 등록 성공");
        } else {
            System.out.println("환자 등록 실패");
        }
    }

    private void readMenu() {
        System.out.println("환자 검색 메뉴");
        System.out.print("환자 등록 번호: ");
        int patientNumber = scanner.nextInt();
        PatientVO patient = readController.getPatient(patientNumber);

        if(patient == null) {
            System.out.println("환자를 조회할 수 없습니다.");
        } else {
            System.out.println(patient.getNumber() + "번 환자 조회 결과");
            System.out.println("환자 등록 번호: " + patient.getNumber());
            System.out.println("진료 코드: " + patient.getCode());
            System.out.println("입원 일수: " + patient.getDays());
            System.out.println("환자 나이: " + patient.getAge());
            System.out.println("진료 과: " + patient.getDept());
            System.out.println("진료비: " + patient.getOperFee());
            System.out.println("입원비: " + patient.getHospitalFee());
            System.out.println("병원비: " + patient.getMoney());
        }
    }

    private void readAllMenu() {
        System.out.println("환자 전체 검색 메뉴");
        List<PatientVO> patients = readAllController.getAllPatients();

        if (patients == null) {
            System.out.println("환자를 조회할 수 없습니다.");
        } else {
            for(PatientVO patient : patients) {
                System.out.println("[" + patient.getNumber() + "번 환자]");
                System.out.println("환자 등록 번호: " + patient.getNumber());
                System.out.println("진료 코드: " + patient.getCode());
                System.out.println("입원 일수: " + patient.getDays());
                System.out.println("환자 나이: " + patient.getAge());
                System.out.println("진료 과: " + patient.getDept());
                System.out.println("진료비: " + patient.getOperFee());
                System.out.println("입원비: " + patient.getHospitalFee());
                System.out.println("병원비: " + patient.getMoney());
                System.out.println();
            }
        }
    }

    private void updateMenu() {
        System.out.println("환자 수정 메뉴");
        System.out.print("환자 등록 번호: ");
        int patientNumber = scanner.nextInt();
        System.out.print("진료 코드: ");
        String code = scanner.next();
        System.out.print("입원 일수: ");
        int days = scanner.nextInt();
        System.out.print("환자 나이: ");
        int age = scanner.nextInt();

        PatientVO patient = new PatientVO(patientNumber, code, days, age);
        new CalcController(patient);
        if(updateController.update(patient)) {
            System.out.println("환자 수정 성공");
        } else {
            System.out.println("환자 수정 실패");
        }
    }

    private int showMenu() {
        System.out.println("┌----------------------------------------┐");
        System.out.println("│    새싹 정형외과 환자 관리 프로그램    │");
        System.out.println("└----------------------------------------┘");
        System.out.print("1. 환자 등록  ");
        System.out.print("2. 환자 검색  ");
        System.out.print("3. 환자 목록  ");
        System.out.print("4. 환자 수정  ");
        System.out.print("5. 환자 삭제  ");
        System.out.println("99. 프로그램 종료");
        System.out.println("===========================================================");
        System.out.print("원하시는 메뉴 번호를 선택해 주세요>> ");
        return scanner.nextInt();
    }
}
