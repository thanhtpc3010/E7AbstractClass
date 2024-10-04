package Entity;

public  class Manager extends Staff {
    private double allowance;

    public Manager(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    // Getter và Setter cho allowance
    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double getTotalSalary() {
        return getSalary() + allowance;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', salary=" + getSalary() + ", allowance=" + allowance + "}";
    }
}

