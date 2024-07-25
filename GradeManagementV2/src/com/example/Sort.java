package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    private List<StudentVO> studentVOs;

    public Sort(List<StudentVO> studentVOs) {
        this.studentVOs = studentVOs;
    }

    public void quickSort() {
//        Collections.sort(studentVOs, new Comparator<StudentVO>() {
//            @Override
//            public int compare(StudentVO o1, StudentVO o2) {
//                return o2.getTotal() - o1.getTotal();
//            }
//        });

        Collections.sort(studentVOs, (o1, o2) -> o2.getTotal() - o1.getTotal());
    }
}
