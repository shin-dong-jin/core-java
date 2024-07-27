package com.example.controller.patient;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;
import java.util.List;

public class ReadAllController {
    private PatientDAO patientDAO;

    public ReadAllController() {
        patientDAO = new PatientDAOImpl();
    }

    public List<PatientVO> readAll() {
        List<PatientVO> patients = null;
        try {
            patients = patientDAO.readAllPatients();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return patients;
    }
}
