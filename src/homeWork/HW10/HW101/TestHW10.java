package homeWork.HW10.HW101;


import homeWork.HW10.HW102.SalaryUtils;
import homeWork.HW9.HW91.Month;
import homeWork.HW9.HW91.MonthUtils;

public class TestHW10 {
    public static void main(String[] args) {

        Employee employee = new Employee("Alice", 100);
        Manager manager = new Manager("Bob", 200);
        Director director = new Director("Charlie", 300);
        // Массив Employee[]
        Employee[] employTotal = { employee, manager, director };

        SalaryUtils salaryUtils = new SalaryUtils(); // Создаём объект SalaryUtils

        MonthUtils monthUtils = new MonthUtils(); // Создаём объект MonthUtils
        Month[] allMonths = monthUtils.months; // Получаем массив всех месяцев
        // Передача выбранных месяцев
        Month[] selectedMonths = { allMonths[0], allMonths[1], allMonths[2] }; // January, February, March

        System.out.println("Employee salary: " + employee.getSalary(selectedMonths));
        System.out.println("Manager salary: " + manager.getSalary(selectedMonths));
        System.out.println("Director salary: " + director.getSalary(selectedMonths));



        System.out.println(salaryUtils.getTotalSalary(employTotal, selectedMonths));
    }
}
