package com.example.model;

import com.example.utils.QueryBuilder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private Connection connection;

    @Override
    public boolean createPatient(PatientVO patient) throws SQLException {
        connection = new DBConnection().getConnection(); // 1 2 3
        Statement statement = connection.createStatement(); // 4
        int result = statement.executeUpdate(QueryBuilder.getInsertQuery(patient)); // 5
        DBClose.dbClose(connection, statement);
        return result == 1;
    }

    @Override
    public PatientVO readPatient(int patientNumber) throws SQLException {
        connection = new DBConnection().getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(QueryBuilder.getReadQuery(patientNumber));
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
        connection = new DBConnection().getConnection();
        Statement statement = connection.createStatement();
        List<PatientVO> patients = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(QueryBuilder.getReadAllQuery());
        while (resultSet.next()) {
            PatientVO patient = new PatientVO(resultSet.getInt("number"), resultSet.getString("code"),
                                                resultSet.getInt("days"), resultSet.getInt("age"));
            patient.setDept(resultSet.getString("dept"));
            patient.setOperFee(resultSet.getInt("operfee"));
            patient.setHospitalFee(resultSet.getInt("hospitalfee"));
            patient.setMoney(resultSet.getInt("money"));
            patients.add(patient);
        }
        DBClose.dbClose(connection, statement);
        return patients;
    }

    @Override
    public boolean updatePatient(PatientVO patient) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(QueryBuilder.getUpdateQuery(patient));
        DBClose.dbClose(connection, statement);
        return result == 1;
    }

    @Override
    public boolean deletePatient(int patientNumber) throws SQLException {
        connection = new DBConnection().getConnection();
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(QueryBuilder.getDeleteQuery(patientNumber));
        DBClose.dbClose(connection, statement);
        return result == 1;
    }
}
