package AT1;

class Employee extends Person {
    private int employeeNumber;
    private double basicSalary;
    private double salary;

    public Employee() {
        super();
        this.employeeNumber = employeeNumber;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void computeSalary() {
        
    }
}