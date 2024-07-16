package management;

public class Employee {
    private boolean isInit;
    private int empId;
    private int grade;
    private int step;
    private double allowance;
    private double salary;
    private double tax;
    private double adjustedSalary;
    private final double TAX_RATE = 0.1; // 세율 (예: 10%)
    private final double TAX_ADJUSTMENT = 50.0; // 조정액 (예: 50)

    // 생성자
    public Employee(int empId, int grade, int step, double allowance) {
        this.empId = empId;
        this.grade = grade;
        this.step = step;
        this.allowance = allowance;
        isInit = true;
    }

    public Employee() {

    }

    public boolean getIsInit() {
        return this.isInit;
    }

    public int getGrade() {
        return grade;
    }

    public int getStep() {
        return step;
    }

    public int getEmpId() {
        return empId;
    }

    public double getAllowance() {
        return allowance;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }

    public double getAdjustedSalary() {
        return adjustedSalary;
    }

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public double getTAX_ADJUSTMENT() {
        return TAX_ADJUSTMENT;
    }

    public String getInputData() {

        return "";
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setAdjustedSalary(double adjustedSalary) {
        this.adjustedSalary = adjustedSalary;
    }

    @Override
    public String toString() {
        return String.format("5s\t%5d\t%5d\t%10d\t");
    }
}