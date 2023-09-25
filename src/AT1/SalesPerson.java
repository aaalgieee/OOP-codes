package AT1;

class SalesPerson extends Employee {
    private double commission;

    public SalesPerson() {
        super();
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public void computeSalary() {
        setSalary(getBasicSalary() + getCommission());
    }
}

