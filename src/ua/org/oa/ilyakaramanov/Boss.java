package ua.org.oa.ilyakaramanov;

/*
Класс Boss наследуется от Employee.
Boss получает еженедельный оклад.
 */

public class Boss extends Employee {

    int weekSalary;
    double weeks;

    public Boss(String firstName, String secondName, int weekSalary, double weeks) {
        super.firstName = firstName;
        super.secondName = secondName;
        this.weeks = weeks;
        this.weekSalary = weekSalary;
    }

    /*
Метод вычисляет ЗП Boss
     */
    @Override
    public double calculateSalary() {
        salary = weekSalary * weeks;
        return salary;
    }
}
