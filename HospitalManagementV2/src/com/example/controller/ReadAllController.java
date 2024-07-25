package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.util.List;

public class ReadAllController {
    private PatientDAO patientDAO;

    public ReadAllController() {
        patientDAO = new PatientDAOImpl();
    }

    public List<PatientVO> getAllPatients() {
        try {
            return patientDAO.readAllPatients();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
