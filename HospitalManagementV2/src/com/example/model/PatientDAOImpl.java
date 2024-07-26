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
        if (!resultSet.next()) {
            return null;
        }
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
        ResultSet resultSet = statement.executeQuery("SELECT * FROM patient ORDER BY number;");
        while (resultSet.next()) {
            patients.add(readPatient(resultSet.getInt("number")));
        }
        DBClose.dbClose(connection, statement);
        return patients;
    }

    @Override
    public boolean updatePatient(PatientVO patient) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("UPDATE patient SET ")
                .append("code=").append("'").append(patient.getCode()).append("',")
                .append("days=").append(patient.getDays()).append(",")
                .append("dept=").append("'").append(patient.getDept()).append("',")
                .append("operfee=").append(patient.getOperFee()).append(",")
                .append("hospitalfee=").append(patient.getHospitalFee()).append(",")
                .append("money=").append(patient.getMoney())
                .append(" WHERE number=").append(patient.getNumber()).append(";");
        int result = statement.executeUpdate(queryBuilder.toString());
        DBClose.dbClose(connection, statement);
        return result == 1;
    }

    @Override
    public boolean deletePatient(int patientNumber) throws SQLException {
        connection = new DBConnection().getConnection();
        Statement statement = connection.createStatement();
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("DELETE FROM patient WHERE number=").append(patientNumber).append(";");
        int result = statement.executeUpdate(queryBuilder.toString());
        DBClose.dbClose(connection, statement);
        return result == 1;
    }
}
