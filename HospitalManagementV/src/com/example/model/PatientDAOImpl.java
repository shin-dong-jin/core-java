
package com.example.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private Connection conn;

    public PatientDAOImpl() {
        DBConnection dbConn = new DBConnection();
        this.conn = dbConn.getConnection();  //1.2.3
    }

    @Override
    public boolean createPatient(PatientVO p) throws SQLException{
        Statement stmt = this.conn.createStatement();  //4.
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO Patient ");
        sb.append("VALUES (" + p.getNumber() + ", '" + p.getCode() + "', ");
        sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', ");
        sb.append(p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ")");
        System.out.println(sb.toString());
        int su = stmt.executeUpdate(sb.toString());    //5
        DBClose.dbClose(this.conn, stmt);
        return (su == 1) ? true : false;
    }

    @Override
    public PatientVO readPatient(int number) throws SQLException {
        String sql = "{call sp_select_one_patient(?)}";
        CallableStatement cstmt = conn.prepareCall(sql);
        cstmt.setInt(1, number);
        ResultSet rs = cstmt.executeQuery();
        if (!rs.next()) {
            return null;
        }
        PatientVO p = new PatientVO(rs.getInt("number"), rs.getString("code"), rs.getInt("days"), rs.getInt("age"));
        p.setDept(rs.getString("dept"));
        p.setOperFee(rs.getInt("operfee"));
        p.setHospitalFee(rs.getInt("hospitalfee"));
        p.setMoney(rs.getInt("money"));
        DBClose.dbClose(this.conn, cstmt);
        return p;
    }

    @Override
    public List<PatientVO> readAllPatient() throws SQLException {
        String sql = "{call sp_select_all_patient()}";
        CallableStatement cstmt = conn.prepareCall(sql);
        ResultSet rs = cstmt.executeQuery();
        List<PatientVO> list = new ArrayList<PatientVO>();

        if (!rs.next()) {
            DBClose.dbClose(this.conn, cstmt);
            return list;
        }

        do {  //6.
            int number = rs.getInt("number");
            String dept = rs.getString("dept");
            int operfee = rs.getInt("operfee");
            int hospitalfee = rs.getInt("hospitalfee");
            int money = rs.getInt("money");
            PatientVO p = new PatientVO();
            p.setNumber(number);    p.setDept(dept);
            p.setOperFee(operfee);    p.setHospitalFee(hospitalfee);
            p.setMoney(money);
            list.add(p);
        } while(rs.next());
        DBClose.dbClose(conn, cstmt, rs);  //7
        return list;
    }

    @Override
    public boolean updatePatient(PatientVO p) throws SQLException {
        String sql = "{call sp_update_patient(?, ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement cstmt = conn.prepareCall(sql);
        cstmt.setInt(1, p.getNumber());
        cstmt.setString(2, p.getCode());
        cstmt.setInt(3, p.getDays());
        cstmt.setInt(4, p.getAge());
        cstmt.setString(5, p.getDept());
        cstmt.setInt(6, p.getOperFee());
        cstmt.setInt(7, p.getHospitalFee());
        cstmt.setInt(8, p.getMoney());

        cstmt.execute();
        DBClose.dbClose(conn, cstmt);
        return true;
    }

    @Override
    public boolean deletePatient(int number) throws SQLException {
        //Statement stmt = this.conn.createStatement();
        String sql = "DELETE FROM patient WHERE number = ?";  //불완전한 SQL문
        PreparedStatement pstmt = this.conn.prepareStatement(sql);  //4.
        pstmt.setInt(1, number);   //완전한 SQL 문장.
        int row = pstmt.executeUpdate();   //5
        DBClose.dbClose(conn, pstmt);       //7
        return (row == 1) ? true : false;
    }

}
