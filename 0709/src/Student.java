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
    String hakbun, name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    char grade;

    @Override
    public String toString() {
        return String.format("%10s\t%10s\t%5d\t%5d\t%5d", hakbun, name, kor, eng, math);
    }
}
