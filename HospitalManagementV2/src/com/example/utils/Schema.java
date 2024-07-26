package com.example.utils;

public enum Schema {
    NUMBER("name"), CODE("code"), DAYS("days"), AGE("age"), DEPT("dept"), OPERFEE("operfee"), HOSPITALFEE("hospitalfee"), MONEY("money");
    private final String value;

    Schema(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
