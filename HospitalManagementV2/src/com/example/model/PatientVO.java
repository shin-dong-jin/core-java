package com.example.model;

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
                .append("code=").append("'").append(code).append("',")
                .append("days=").append(days).append(",")
                .append("dept=").append("'").append(dept).append("',")
                .append("operfee=").append(operFee).append(",")
                .append("hospitalfee=").append(hospitalFee).append(",")
                .append("money=").append(money)
                .append(" WHERE number=").append(number).append(";");
        return query.toString();
    }
}