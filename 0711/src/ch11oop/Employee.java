package ch11oop;

public class Employee {
    String employeeID;
    double salary;

    public Employee() {
//        new Employee("임시사번", 10_000_000);
        this("Unknown", 10_000_000.);
    }

    public Employee(String employeeID) {
        this(employeeID, 10_000_000.);
    }

    public Employee(double salary) {
        this("Unknown", salary);
    }

    public Employee(String employeeID, double salary) {
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
