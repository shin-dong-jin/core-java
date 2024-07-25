package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Output {
    private Connection connection;
    private List<StudentVO> studentVOs;

    public Output(List<StudentVO> studentVOs) {
        this.studentVOs = studentVOs;
        DBConnection dbConnection = new DBConnection();
        this.connection = dbConnection.getConnection(); // 1 2 3
    }

    void output() {
//        studentVOs.forEach(System.out::print);

        try (Statement statement = connection.createStatement()) {
            studentVOs.forEach(studentVO -> {
                StringBuilder query = new StringBuilder();
                query.append("INSERT INTO student VALUES(")
                        .append("'").append(studentVO.getStudentID()).append("'").append(",")
                        .append("'").append(studentVO.getName()).append("'").append(",")
                        .append(studentVO.getKor()).append(",")
                        .append(studentVO.getEng()).append(",")
                        .append(studentVO.getMath()).append(",")
                        .append(studentVO.getEdp()).append(",")
                        .append(studentVO.getTotal()).append(",")
                        .append(studentVO.getAvg()).append(",")
                        .append("'").append(studentVO.getGrade()).append("'").append(");");
                try {
                    statement.executeUpdate(query.toString()); // 5
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });

            DBClose.dbClose(connection, statement); // 6 생략, 7
            System.out.println("DB Inserted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
