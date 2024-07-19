/*
    작성자: 성기범
    작성일: 2024-07-19
    작성목적: 병원관리프로그램 - Input
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.List;
import java.util.Scanner;
public class Input {

    public void patientInfo(List<Patient> patients) {

        Scanner sc = new Scanner(System.in);
        String ioSelect = "";

        do {
            System.out.print("번호: ");
            int patientNum = sc.nextInt(); //번호입력
            System.out.print("진료코드: ");
            String code = sc.next().toUpperCase(); //진료코드 입력. 소문자 입력도 고려
            System.out.print("입원일수: ");
            int hosDate = sc.nextInt(); //입원일수 입력
            System.out.print("나이: ");
            int age = sc.nextInt(); //나이 입력

            patients.add(new Patient(patientNum, code, hosDate, age)); //list에 저장

            System.out.print("입력/출력(I/O)? : "); //입력 혹은 출력 선택
            ioSelect = sc.next();

        } while (ioSelect.equalsIgnoreCase("i")); //소문자 혹은 대문자 i 입력 시 do 반복. 소문자 혹은 대문자 o 입력 시  while문 종료

    }
}
