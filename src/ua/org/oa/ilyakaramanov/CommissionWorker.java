package ua.org.oa.ilyakaramanov;

/*
Класс CommissionWorker наследуется от Employee.
CommissionWorker получает базовую ЗП и процент от продаж.
 */

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

    /*
    Метод вычисляет ЗП CommissionWorker
     */

    @Override
    public double calculateSalary() {
        salary = regularSalary + sales * percent;
        return salary;
    }
}
