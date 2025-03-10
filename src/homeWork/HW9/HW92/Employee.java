package homeWork.HW9.HW92;

import homeWork.HW9.HW91.Month;
import homeWork.HW9.HW93.Manager;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;

    public Employee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, int age, String sex, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
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

    public int getSalary(Month[] monthArray) {
        int totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkDays() * this.salaryPerDay;
        }
        return totalSalary;
    }

    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(this.name, this.age, this.sex, this.salaryPerDay, numberOfSubordinates);
    }
}