package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class ReadController {
    private PatientDAO patientDAO;

    public ReadController() {
        patientDAO = new PatientDAOImpl();
    }

    public PatientVO getPatient(int patienNumber) {
        try {
            return patientDAO.readPatient(patienNumber);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
