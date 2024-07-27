package com.example.utils;

public enum Schema {
    TABLE("patient", "환자 테이블"),
    NUMBER("number", "번 환자 조회 결과"),
    CODE("code", "진료 코드"),
    DAYS("days", "입원 일수"),
    AGE("age", "환자 나이"),
    DEPT("dept", "진찰 부서"),
    OPERFEE("operfee", "진찰비"),
    HOSPITALFEE("hospitalfee", "입원비"),
    MONEY("money", "진료비");

    private final String value;
    private final String korean;

    Schema(String value, String korean) {
        this.value = value;
        this.korean = korean;
    }

    public String read() {
        return korean;
    }

    @Override
    public String toString() {
        return value;
    }
}
