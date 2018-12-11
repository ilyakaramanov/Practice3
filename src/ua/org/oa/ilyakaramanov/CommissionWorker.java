package ua.org.oa.ilyakaramanov;

public class CommissionWorker extends Employee {

    int regularSalary;
    int sales;
    double percent = 0.03;

    public CommissionWorker(String firstName, String secondName, int regularSalary, int sales) {
        super.firstName = firstName;
        super.secondName = secondName;
        this.sales = sales;
        this.regularSalary = regularSalary;
    }

    @Override
    public double calculateSalary() {
        salary = regularSalary + sales * percent;
        return salary;
    }
}
