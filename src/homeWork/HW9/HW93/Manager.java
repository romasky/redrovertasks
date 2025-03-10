package homeWork.HW9.HW93;

import homeWork.HW9.HW91.Month;

public class Manager {
    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;
    private int countOfEmployees;

    public Manager(String name, int age, String sex, int salaryPerDay, int countOfEmployees) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
        this.countOfEmployees = countOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkDays() * salaryPerDay;
        }
        return totalSalary + totalSalary * (countOfEmployees / 100.0);
    }
}