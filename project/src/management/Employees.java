package management;

public class Employees {
    private int size;
    private Employee[] employees;

    public Employees() {
        employees = new Employee[5];
    }

    public void add(Employee employee) {
        employees[size++] = employee;
    }

    public Employee getEmployee(int index) {
        return employees[index];
    }

    public int getSize() {
        return size;
    }

}