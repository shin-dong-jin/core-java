package ch12exception;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setKor(90);
            student.setHistory(130);

            // Exception 발생하면 throw --> catch로 이동

            System.out.println(student);
        } catch (KoreanException e) {
            System.out.println(e.getMessage());
        } catch (HistoryException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private int kor, history;

    // Checked exception은 메소드 선언부에 throws exception 명시
    // [modifier] [static] [return type] [method name] [parameters] throws exception
    public void setKor(int kor) {
        if (kor < 0 || kor > 100) {
            throw new KoreanException("kor is out of range(0, 100)");
        }
        this.kor = kor;
    }

    public void setHistory(int history) throws HistoryException {
        if (history < 0 || history > 100) {
            throw new HistoryException("history is out of range(0, 100)");
        }
        this.history = history;
    }

    @Override
    public String toString() {
        return "kor = " + this.kor + ", history = " + this.history;
    }
}

// 1. 누구에게 상속받는가? [Checked exception] extends Exception, [Unchecked exception] extends RuntimeException
// 2. 생성자를 만들었는가?
class KoreanException extends RuntimeException { // unchecked exception
    public KoreanException() {
        super();
    }
    public KoreanException(String message) {
        super(message);
    }
}

class HistoryException extends Exception { // checked exception
    public HistoryException() {

    }

    public HistoryException(String message) {
        super(message);
    }
}