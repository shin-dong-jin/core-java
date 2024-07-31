package com.example.controller;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

import java.sql.SQLException;

public class UpdateController {
    private PatientDAO pDao;

    public UpdateController() {
        pDao = new PatientDAOImpl();
    }

    public boolean update(PatientVO p) {
        boolean result = false;
        try {
            new CalcController(p);
            pDao.updatePatient(p);
            result = true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
