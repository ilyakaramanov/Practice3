package ua.org.oa.ilyakaramanov;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double count = 0;
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Boss("Robert", "Rodriguez", 1000, 4.4));
        list.add(new HourlyWorker("Mickey", "Rourke", 20, 180));
        list.add(new HourlyWorker("Jessica", "Alba", 18, 120));
        list.add(new PieceWorker("Benicio", "Toro", 8, 400));
        list.add(new PieceWorker("Brittany", "Murphy", 8, 350));
        list.add(new CommissionWorker("Bruce", "Willis", 2000, 4000));
        list.add(new CommissionWorker("Elijah", "Wood", 1800, 5000));

        for (Employee company : list) {
            company.calculateSalary();
            company.displayInfo();
            count += company.calculateSalary();
        }
        System.out.println("Общая выплата в этом месяце составит: " + count);
    }
}
