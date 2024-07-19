/*
    작성자: 성기범, 신동진
    작성일: 2024-07-19
    작성목적: 병원관리프로그램 - PatientMgmt
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Input input = new Input();
        input.patientInfo(patients);

        Calculation calculation = new Calculation(patients);
        calculation.calculate();
        calculation.sort();

        Output output = new Output(patients);
        output.viewPatients();
    }
}
