import Task1.Accountant;
import Task1.Employee;
import Task2.SpeedCalculation;
import Task2.Vehicle;
import Task2.heirs.Bus;
import Task2.heirs.Car;
import Task3.Circle;
import Task3.Cube;
import Task4.Rectangle;
import Task4.Square;
import Task5.Car1;
import Task5.PetrolEngine;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1 Пункт

        Employee worker = new Employee("Николас", new Date());
        Accountant accountant = new Accountant("Мария");
        accountant.calculateNetSalary(worker, 100000);
        System.out.println(worker.toString());

        // 2 Пункт

        Vehicle car = new Car(150, "Легкий");
        Vehicle bus = new Bus(100, "Тяжелый");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println(speedCalculation.calculateAllowedSpeed(car));
        System.out.println(speedCalculation.calculateAllowedSpeed(bus));

        // 3 Пункт

        Cube cube = new Cube(10);
        Circle circle = new Circle(5);
        System.out.println(cube.volume());
        System.out.println(cube.area());
        System.out.println(circle.area());
        // System.out.println(circle.volume()); Ошибка!

        // 4 Пункт

        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.getHeight();
        // square.getHeight(); Ошибка!

        // 5 Пункт

        PetrolEngine petrolEngine = new PetrolEngine();
        Car1 car1 = new Car1(petrolEngine);
        car1.start();

    }
}