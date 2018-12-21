package ua.org.oa.ilyakaramanov;

/*
Класс, от которого наследуются остальные классы
 */

public abstract class Employee {
    String firstName;
    String secondName;
    double salary;

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println(firstName + " " + secondName + " зарплата - " + salary);
    }

}
