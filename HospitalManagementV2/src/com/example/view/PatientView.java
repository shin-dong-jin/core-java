package com.example.view;

import com.example.controller.InsertController;
import com.example.model.PatientVO;

import java.util.Scanner;

public class PatientView {
    private InsertController insertController;
    private Scanner scanner;

    public PatientView() {
        insertController = new InsertController();
        scanner = new Scanner(System.in);
        Outer: while (true) {
            switch (showMenu()) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
