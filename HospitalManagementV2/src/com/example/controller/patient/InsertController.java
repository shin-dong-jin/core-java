package com.example.controller.patient;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class InsertController {
    private PatientDAO patientDAO;

    public InsertController() {
        patientDAO = new PatientDAOImpl();
    }

    public boolean insert(PatientVO patient) {
        boolean result = false;
        try {
            new CalcController(patient);
            result = patientDAO.createPatient(patient);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
