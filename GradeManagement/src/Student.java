public class Student {
    private String studentID, name;
    private int kor, eng, math, edp, total;
    private double avg;
    private char grade;

    public Student(String studentID, String name, int kor, int eng, int math, int edp) {
        this.studentID = studentID;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.edp = edp;
    }

    public String getStudentID() {
        return studentID;
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

    public int getEdp() {
        return edp;
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

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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

    public void setEdp(int edp) {
        this.edp = edp;
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
        return String.format("%-5s\t%7s\t%5d\t%5d\t%5d\t%5d\t%5d\t%8.1f\t%5c%n",
                this.studentID, this.name, this.kor, this.eng, this.math, this.edp, this.total, this.avg, this.grade);
    }
}
