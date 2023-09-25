package AT1;

class Manager extends Employee {
    private double allowance;

    public Manager() {
        super();
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public void computeSalary() {
        setSalary(getBasicSalary() + getAllowance());
    }
}
