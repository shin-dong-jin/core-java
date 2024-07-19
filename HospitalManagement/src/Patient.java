/*
    작성자: 성기범, 신동진
    작성일: 2024-07-19
    작성목적: 병원관리프로그램 - Patient
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.text.DecimalFormat;

public class Patient {
    private int patientNum;
    private String code;
    private int hosDate;
    private int age;
    private String department;
    private int examPrice;
    private double hosPrice;
    private double totalPrice;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Patient(int patientNum, String code, int hosDate, int age) {
        this.patientNum = patientNum;
        this.code = code;
        this.hosDate = hosDate;
        this.age = age;
    }

    public int getPatientNum() {
        return patientNum;
    }

    public String getCode() {
        return code;
    }

    public int getHosDate() {
        return hosDate;
    }

    public int getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setExamPrice(int examPrice) {
        this.examPrice = examPrice;
    }

    public void setHosPrice(double hosPrice) {
        this.hosPrice = hosPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return String.format("%3d\t%8s\t%7d\t%7s\t%7s", patientNum, department, examPrice, df.format(hosPrice), df.format(totalPrice));
    }
}