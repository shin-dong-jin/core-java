/*
    작성자: 신동진
    작성일: 2024-07-19
    작성목적: 병원관리프로그램 - Calculation
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Calculation {

    private List<Patient> patients;
    private static Map<String, String> codeToDep = new Hashtable<>() {
        {
            put("MI", "외과");
            put("NI", "내과");
            put("SI", "피부과");
            put("TI", "소아과");
            put("VI", "산부인과");
            put("WI", "비뇨기과");
        }
    };

    public Calculation(List<Patient> patients) {
        this.patients = patients;
    }

    public void calculate() {
        for(Patient patient : patients) {
            int age = patient.getAge();
            int examPrice = age < 10 ? 7_000 :
                    age < 20 ? 5_000 :
                            age < 30 ? 8_000 :
                                    age < 40 ? 7_000 :
                                            age < 50 ? 4_500 : 2_300;

            int hosDate = patient.getHosDate();
            double rate = hosDate < 10 ? 1.00 :
                    hosDate < 15 ? 0.85 :
                            hosDate < 20 ? 0.80 :
                                    hosDate < 30 ? 0.77 :
                                            hosDate < 100 ? 0.72 : 0.68;

            int dayPrice = hosDate <= 3 ? 30_000 : 25_000;
            int totalHosPrice = dayPrice * patient.getHosDate();
            double hosPrice = totalHosPrice * rate;
            double totalPrice = examPrice + hosPrice;
            patient.setDepartment(codeToDep.get(patient.getCode()));
            patient.setExamPrice(examPrice);
            patient.setHosPrice(hosPrice);
            patient.setTotalPrice(totalPrice);
        }
    }

    public void sort() {
        Collections.sort(patients, (o1, o2) -> o1.getPatientNum() - o2.getPatientNum());
    }
}

