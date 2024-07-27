package com.example.utils;

import com.example.model.PatientVO;

import static com.example.utils.Schema.NUMBER;
import static com.example.utils.Schema.TABLE;

public class QueryBuilder {

    private QueryBuilder() {

    }

    public static String getInsertQuery(PatientVO patient) {
        return patient.getInsertQuery();
    }

    public static String getReadQuery(int patientNumber) {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ")
                .append(TABLE)
                .append(" WHERE ")
                .append(NUMBER)
                .append(" = ")
                .append(patientNumber)
                .append(";");
        return query.toString();
    }

    public static String getReadAllQuery() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ")
                .append(TABLE)
                .append(" ORDER BY ")
                .append(NUMBER)
                .append(";");
        return query.toString();
    }

    public static String getUpdateQuery(PatientVO patient) {
        return patient.getUpdateQuery();
    }

    public static String getDeleteQuery(int patientNumber) {
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM ")
                .append(TABLE)
                .append(" WHERE ")
                .append(NUMBER)
                .append(" = ")
                .append(patientNumber)
                .append(";");
        return query.toString();
    }
}
