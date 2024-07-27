package com.example.controller.patient;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class ReadController {
    private PatientDAO patientDAO;

    public ReadController() {
        patientDAO = new PatientDAOImpl();
    }

    public PatientVO read(int patienNumber) {
        PatientVO patient = null;
        try {
            patient = patientDAO.readPatient(patienNumber);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return patient;
    }
}
