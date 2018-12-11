package ua.org.oa.ilyakaramanov;

public class HourlyWorker extends Employee {

    final int HOURS = 160;
    int hoursSalary;
    int totalHours;
    double extraSalary = hoursSalary * 1.3;

    public HourlyWorker(String firstName, String secondName, int hoursSalary, int totalHours) {
        super.firstName = firstName;
        super.secondName = secondName;
        this.hoursSalary = hoursSalary;
        this.totalHours = totalHours;
    }

    @Override
    public double calculateSalary() {
        if (HOURS <= totalHours) {
            salary = HOURS * hoursSalary;
        } else {
            salary = HOURS * hoursSalary + ((totalHours - HOURS) * extraSalary);
        }
        return salary;
    }
}
