package com.example;

import java.util.List;

public class Input {
    private java.util.Scanner scanner;
    private List<StudentVO> studentVOs;

    public Input(List<StudentVO> studentVOs) throws java.io.IOException {
        this.scanner = new java.util.Scanner(new java.io.File("./sungjuk_utf8.txt")).useDelimiter("\\s+");
        this.studentVOs = studentVOs;
    }

    void input() {
        while(scanner.hasNext()) {
            /* 문자열 파싱
                string.split(정규식)
                scanner.useDelimiter(정규식)
             */
            studentVOs.add(new StudentVO(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
    }
}
