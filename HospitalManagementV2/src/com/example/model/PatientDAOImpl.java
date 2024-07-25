package com.example.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private Connection connection;

    public PatientDAOImpl() {
        DBConnection dbConnection = new DBConnection();
        this.connection = dbConnection.getConnection(); // 1 2 3
    }

    @Override
    public boolean createPatient(PatientVO patient) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        this.connection = dbConnection.getConnection(); // 1 2 3
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
    public PatientVO readPatient(int patientNumber) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        this.connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("SELECT * FROM patient WHERE number = ").append(patientNumber).append(";");
        ResultSet resultSet = statement.executeQuery(queryBuilder.toString());
        resultSet.next();
        PatientVO patient = new PatientVO(resultSet.getInt("number"),resultSet.getString("code"),
                resultSet.getInt("days"), resultSet.getInt("age"));
        patient.setDept(resultSet.getString("dept"));
        patient.setOperFee(resultSet.getInt("operfee"));
        patient.setHospitalFee(resultSet.getInt("hospitalfee"));
        patient.setMoney(resultSet.getInt("money"));
        DBClose.dbClose(connection, statement);
        return patient;
    }

    @Override
    public List<PatientVO> readAllPatients() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        this.connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        List<PatientVO> patients = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM patient;");
        while (resultSet.next()) {
            patients.add(readPatient(resultSet.getInt("number")));
        }
        DBClose.dbClose(connection, statement);
        return patients;
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
