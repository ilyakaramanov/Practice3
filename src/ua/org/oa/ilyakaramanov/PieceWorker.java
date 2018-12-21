package ua.org.oa.ilyakaramanov;

/*
Класс PieceWorker наследуется от Employee.
PieceWorker получает ЗП по количеству сделанных изделий.
 */

public class PieceWorker extends Employee {

    int amount;
    int amountPrice;

    public PieceWorker(String firstName, String secondName, int amountPrice, int amount) {
        super.firstName = firstName;
        super.secondName = secondName;
        this.amount = amount;
        this.amountPrice = amountPrice;
    }

    /*
    Метод вычисляет ЗП PieceWorker
     */

    @Override
    public double calculateSalary() {
        salary = amount * amountPrice;
        return salary;
    }
}
