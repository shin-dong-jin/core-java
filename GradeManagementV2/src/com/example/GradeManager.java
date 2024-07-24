package com.example;

import java.util.ArrayList;
import java.util.List;

public class GradeManager {

    public static void main(String[] args) throws java.io.IOException {
        List<StudentVO> studentVOs = new ArrayList<>();

        Input input = new Input(studentVOs);
        input.input();

        Calc calc = new Calc(studentVOs);
        calc.calc();

//        Sort sort = new Sort(studentVOs);
//        sort.quickSort();

        Output output = new Output(studentVOs);
        output.output();

        System.out.println("Program is over...");
    }
}
