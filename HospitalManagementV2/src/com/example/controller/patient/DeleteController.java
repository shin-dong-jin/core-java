package com.example.controller.patient;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;

import java.sql.SQLException;

public class DeleteController {
    PatientDAO patientDAO;

    public DeleteController() {
        patientDAO = new PatientDAOImpl();
    }

    public boolean delete(int patientNumber) {
        boolean result = false;

        try {
            result = patientDAO.deletePatient(patientNumber);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
}
