package com.example.utils;

import com.example.model.PatientVO;

public class QueryBuilder {

    private QueryBuilder() {

    }

    public static String getInsertQuery(PatientVO patient) {
        return patient.getInsertQuery();
    }

    public static String getReadQuery(int patientNumber) {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM patient WHERE number = ").append(patientNumber).append(";");
        return query.toString();
    }

    public static String getReadAllQuery() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM patient ORDER BY number;");
        return query.toString();
    }

    public static String getUpdateQuery(PatientVO patient) {
        return patient.getUpdateQuery();
    }

    public static String getDeleteQuery(int patientNumber) {
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM patient WHERE number = ").append(patientNumber).append(";");
        return query.toString();
    }
}
