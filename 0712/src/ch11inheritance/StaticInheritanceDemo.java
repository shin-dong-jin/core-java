package ch11inheritance;

/* static 변수와 static 메소드는 상속되지 않는다. */
public class StaticInheritanceDemo {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.age;
        System.out.println(Person.age);
    }
}

class Person {
    String name = "한지민";
    static int age = 28;
}

class Student extends Person {

}