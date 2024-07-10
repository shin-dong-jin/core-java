package ch07methods;

public class Student {
    /* Field, 속성(Attribute, Property, State)
    학번
    이름
    국어
    영어
    수학
    총점
    평균
    학점
     */
    private String hakbun, name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;
    private char grade;

    public void print() {
        System.out.printf("%-10s\t%5d%5d%5d%5d%7.1f%3c%n", hakbun, kor, eng, math, total, avg, grade);
    }

    public String getHakbun() {
        return hakbun;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getTotal() {
        return total;
    }

    public double getAvg() {
        return avg;
    }

    public char getGrade() {
        return grade;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%10s\t%10s\t%5d\t%5d\t%5d", hakbun, name, kor, eng, math);
    }
}
