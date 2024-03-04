import java.util.Date;

// 1) Переписать код в соответствии с Single Responsibility Principle:
public class Employee { // Работник

    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) { // Конструктор
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() { // Вывод информации
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int calculateNetSalary() { // Установка зарплаты с учетом налогов
        int tax = (int) (baseSalary * 0.25); // calculate in otherway
        return baseSalary - tax;
    }
}

public class Accountant {
    
}
