package Entity;

public class Technician extends Staff {
    private double overtimePay;

    public Technician(String name, double salary, double overtimePay) {
        super(name, salary);
        this.overtimePay = overtimePay;
    }

    // Getter và Setter cho overtimePay
    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
    @Override
    public double getTotalSalary() {
        return getSalary() + overtimePay;
    }

    @Override
    public String toString() {
        return "Technician{name='" + getName() + "', salary=" + getSalary() + ", overtimePay=" + overtimePay + "}";
    }
}

