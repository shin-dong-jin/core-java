package com.example.model;

import static com.example.utils.Schema.*;

public class PatientVO {
    private int number;    //환자번호
    private String code;    //진료코드
    private int days;        //입원일수
    private int age;         //나이
    private String dept;   //진찰부서
    private int operFee;  //진찰비
    private int hospitalFee;   //입원비
    private int money;   //진료비

    public PatientVO(int number, String code, int days, int age) {
        this.number = number;
        this.code = code;
        this.days = days;
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getOperFee() {
        return operFee;
    }

    public void setOperFee(int operFee) {
        this.operFee = operFee;
    }

    public int getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(int hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public int getDays() {
        return days;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("%3d\t  %10s\t\t%,5d\t\t%,10d\t%,10d",
                number, dept, operFee, hospitalFee, money);
    }

    public String read() {
        StringBuilder builder = new StringBuilder();
        builder.append(number).append(NUMBER.read()).append(System.lineSeparator())
                        .append(CODE.read()).append(": ").append(code).append(System.lineSeparator())
                        .append(DAYS.read()).append(": ").append(days).append(System.lineSeparator())
                        .append(AGE.read()).append(": ").append(age).append(System.lineSeparator())
                        .append(DEPT.read()).append(": ").append(dept).append(System.lineSeparator())
                        .append(OPERFEE.read()).append(": ").append(operFee).append(System.lineSeparator())
                        .append(HOSPITALFEE.read()).append(": ").append(hospitalFee).append(System.lineSeparator())
                        .append(MONEY.read()).append(": ").append(money).append(System.lineSeparator());
        return builder.toString();
    }

    public void readAll(StringBuilder builder) {
        builder.append(number).append("\t\t")
                .append(dept).append("\t\t")
                .append(operFee).append("\t")
                .append(hospitalFee).append("\t")
                .append(money).append(System.lineSeparator());
    }

    public String getInsertQuery() {
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO patient ")
                .append("VALUES(")
                .append(number).append(",")
                .append("'").append(code).append("',")
                .append(days).append(",")
                .append(age).append(",")
                .append("'").append(dept).append("',")
                .append(operFee).append(",")
                .append(hospitalFee).append(",")
                .append(money).append(");");
        return query.toString();
    }

    public String getUpdateQuery() {
        StringBuilder query = new StringBuilder();
        query.append("UPDATE patient SET ")
                .append(CODE).append("='").append(code).append("',")
                .append(DAYS).append("=").append(days).append(",")
                .append(DEPT).append("='").append(dept).append("',")
                .append(OPERFEE).append("=").append(operFee).append(",")
                .append(HOSPITALFEE).append("=").append(hospitalFee).append(",")
                .append(MONEY).append("=").append(money)
                .append(" WHERE ").append(NUMBER).append("=").append(number).append(";");
        return query.toString();
    }
}