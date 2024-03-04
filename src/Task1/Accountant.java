package Task1;

import java.util.Date;

public class Accountant {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Accountant(String name) {
        this.name = name;
    }

    public void calculateNetSalary(Employee worker, int baseSalary) { // Установка зарплаты с учетом налогов
        int tax = (int) (baseSalary * 0.25); // calculate in otherway
        worker.setBaseSalary(baseSalary - tax);
    }

}
