package homeWork.HW8.HW83;

import homeWork.HW8.HW81.Month;

public class Manager {
    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;
    private int countOfEmployees;


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

    public int getcountOfEmployees() {
        return countOfEmployees;
    }
    public void setcountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }


    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month: monthArray) {
            totalSalary += month.workDays * getSalaryPerDay();
        }
        return totalSalary + totalSalary*(getcountOfEmployees()/100.0);
    }

}
