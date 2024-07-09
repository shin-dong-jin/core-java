import java.util.Arrays;

public class FileGradeManagement {

    public static void main(String[] args) throws java.io.IOException {
        Student[] students = new Student[3]; // students: variable to save students
        java.util.Scanner scanner = new java.util.Scanner(new java.io.File("./src/sungjuk.dat"));
        for (int i = 0; i < 3; i++) {
            String[] line = Arrays.stream(scanner.nextLine().split("\\s+")).map(String::trim).toArray(String[]::new);
            students[i] = new Student();
            students[i].hakbun = line[0];
            students[i].name = line[1];
            students[i].kor = Integer.parseInt(line[2]);
            students[i].eng = Integer.parseInt(line[3]);
            students[i].math = Integer.parseInt(line[4]);
        }

        for(Student student : students) {
            System.out.println(student);
        }
    }
}
