package com.example;

import java.util.List;

public class Calc {
    private List<StudentVO> studentVOs;

    public Calc(List<StudentVO> studentVOs) {
        this.studentVOs = studentVOs;
    }

    void calc() {
        studentVOs.forEach(studentVO -> {
            int total = studentVO.getKor() + studentVO.getEng() + studentVO.getMath() + studentVO.getEdp();
            double avg = total / 4.;
            char grade = avg >= 90. ? 'A' :
                    avg >= 80. ? 'B' :
                            avg >= 70 ? 'C' :
                                    avg >= 60 ? 'D' : 'F';
            studentVO.setTotal(total);
            studentVO.setAvg(avg);
            studentVO.setGrade(grade);
        });
    }
}
