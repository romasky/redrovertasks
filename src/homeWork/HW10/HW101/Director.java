package homeWork.HW10.HW101;

import homeWork.HW9.HW91.Month;

public class Director extends Manager{

    public Director(String name, int salaryPerDay) {
        super(name, salaryPerDay);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray); // Основная зарплата из Manager
        double bonus = baseSalary * (getCountOfEmployees() * 0.03); // 3% за каждого подчиненного
        return baseSalary + bonus;
    }

}
