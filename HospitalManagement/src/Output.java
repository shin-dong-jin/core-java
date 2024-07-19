/*
    작성자: 신동진
    작성일: 2024-07-19
    작성목적: 병원관리프로그램 - Output
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.List;

public class Output {

    private List<Patient> patients;

    public Output(List<Patient> patients) {
        this.patients = patients;
    }

    public void viewPatients() {
        System.out.println("          <병원관리프로그램>>");
        System.out.println("------------------------------------");
        System.out.printf("%4s%5s%7s%7s%7s%n", "번호", "진찰부서", "진찰비", "입원비", "진료비");
        for(Patient patient : patients) {
            System.out.println(patient);
        }
        System.out.println("------------------------------------");
    }
}

