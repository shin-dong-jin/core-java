package com.example.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private Connection connection;

    public PatientDAOImpl() {
        DBConnection dbConnection = new DBConnection();
        this.connection = dbConnection.getConnection(); // 1 2 3
    }

    @Override
    public boolean createPatient(PatientVO patient) throws SQLException {
        Statement statement = connection.createStatement(); // 4
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("INSERT INTO patient ")
                        .append("VALUES(")
                        .append(patient.getNumber()).append(",")
                        .append("'").append(patient.getCode()).append("',")
                        .append(patient.getDays()).append(",")
                        .append(patient.getAge()).append(",")
                        .append("'").append(patient.getDept()).append("',")
                        .append(patient.getOperFee()).append(",")
                        .append(patient.getHospitalFee()).append(",")
                        .append(patient.getMoney()).append(");");

        System.out.println(queryBuilder);
        int su = statement.executeUpdate(queryBuilder.toString()); // 5
        DBClose.dbClose(connection, statement);
        return su == 1;
    }

    @Override
    public PatientVO readPatient(int patientNumber) {
        return null;
    }

    @Override
    public List<PatientVO> readAllPatients() {
        return null;
    }

    @Override
    public boolean updatePatient(PatientVO patient) {
        return false;
    }

    @Override
    public boolean deletePatient(int patientNumber) {
        return false;
    }
}
