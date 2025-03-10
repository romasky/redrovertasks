package homeWork.HW10.HW101;

import homeWork.HW9.HW91.Month;

public class Manager extends Employee {
    private int countOfEmployees;

    public Manager(String name, int salaryPerDay) {
        super(name, salaryPerDay);
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray); // Основная зарплата из Employee
        double bonus = baseSalary * (countOfEmployees * 0.01); // 1% за каждого подчиненного
        return baseSalary + bonus;
    }


}
