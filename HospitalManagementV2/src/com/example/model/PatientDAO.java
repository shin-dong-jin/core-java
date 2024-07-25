package com.example.model;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    /**
     * 새로운 환자를 등록한다. 이미 등록된 환자가 있다면 false 리턴, 등록에 성공하면 true 리턴
     * @param patient
     * @return 등록 성공하면 true, 그렇지 않으면 false
     */
    boolean createPatient(PatientVO patient) throws SQLException;

    /**
     * 환자 등록 번호를 입력받아서 해당 번호의 환자 한 명을 리턴한다.
     * @param patientNumber
     * @return 해당 환자 한 명
     */
    PatientVO readPatient(int patientNumber);

    /**
     * 지금까지 등록된 모든 환자 리스트를 반환
     * @return 환자형 리스트
     */
    List<PatientVO> readAllPatients();

    /**
     * 수정할 환자 정보를 입력받아서 수정 성공하면 true 리턴, 실패하면 false 리턴
     * @param patient
     * @return 성공여부
     */
    boolean updatePatient(PatientVO patient);

    /**
     * 환자 등록 번호를 입력받아서 해당 환자를 삭제한다. 
     * @param patientNumber
     * @return 성공여부
     */
    boolean deletePatient(int patientNumber);
}
