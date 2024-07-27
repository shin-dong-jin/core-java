package com.example.utils;

public class MessageBuilder {
    private static final String[] insertMenu = {"[환자 등록 메뉴]", "환자 등록 번호: ", "진료 코드: ", "입원 일수: ", "환자 나이: "},
                                    insertResult = {"환자 등록 성공", "환자 등록 실패"},
                                    readMenu = {"[환자 검색 메뉴]", "환자 등록 번호: "},
                                    readResult = {"환자 조회 실패"},
                                    readAllMenu = {"[환자 목록 메뉴]"},
                                    readAllResult = {"번호\t진찰부서\t진찰비\t입원비\t진료비", "목록 조회 실패"},
                                    updateMenu = {"[환자 수정 메뉴]", "환자 등록 번호: ", "진료 코드: ", "입원 일수: ", "환자 나이: "},
                                    updateResult = {"환자 수정 성공", "환자 수정 실패"},
                                    deleteMenu = {"[환자 삭제 메뉴]", "환자 등록 번호: "},
                                    deleteResult = {"환자 삭제 성공", "환자 삭제 실패"};
    private static final String startMenu =
              "                    ┌----------------------------------------┐" + System.lineSeparator()
            + "                    │    새싹 정형외과 환자 관리 프로그램      │" + System.lineSeparator()
            + "                    └----------------------------------------┘" + System.lineSeparator()
            + "1. 환자 등록  2. 환자 검색  3. 환자 목록  4. 환자 수정  5. 환자 삭제  99. 프로그램 종료" + System.lineSeparator()
            + "========================================================================================" + System.lineSeparator()
            + "원하시는 메뉴 번호를 선택해 주세요>> ",
                                programOver = "Program is over...",
                                wrongChoice = "잘못된 번호를 입력하셨습니다.";

    private MessageBuilder() {

    }

    public static String getStartMenu() {
        return startMenu;
    }

    public static String[] getInsertMenu() {
        return insertMenu;
    }

    public static String[] getInsertResult() {
        return insertResult;
    }

    public static String[] getReadMenu() {
        return readMenu;
    }

    public static String[] getReadResult() {
        return readResult;
    }

    public static String[] getReadAllMenu() {
        return readAllMenu;
    }

    public static String[] getReadAllResult() {
        return readAllResult;
    }

    public static String[] getUpdateMenu() {
        return updateMenu;
    }

    public static String[] getUpdateResult() {
        return updateResult;
    }

    public static String[] getDeleteMenu() {
        return deleteMenu;
    }

    public static String[] getDeleteResult() {
        return deleteResult;
    }

    public static String getProgramOver() {
        return programOver;
    }

    public static String getWrongChoice() {
        return wrongChoice;
    }
}
