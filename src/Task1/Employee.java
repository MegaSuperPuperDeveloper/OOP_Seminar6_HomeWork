package Task1;

import java.util.Date;

// 1) Переписать код в соответствии с Single Responsibility Principle:
public class Employee { // Работник

    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob) { // Конструктор
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() { // Вывод информации
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

