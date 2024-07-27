package com.example.controller.patient;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class UpdateController {
    private PatientDAO patientDAO;

    public UpdateController() {
        patientDAO = new PatientDAOImpl();
    }

    public boolean update(PatientVO patient) {
        boolean result = false;
        try {
            result = patientDAO.updatePatient(patient);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
