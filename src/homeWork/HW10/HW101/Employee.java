package homeWork.HW10.HW101;

import homeWork.HW9.HW91.Month;

public class Employee {

    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public Employee(String name, int salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }


    public double getSalary(Month[] monthArray) {
        int totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkDays() * this.salaryPerDay;
        }
        return totalSalary;
    }


}
