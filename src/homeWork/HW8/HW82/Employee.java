package homeWork.HW8.HW82;

import homeWork.HW8.HW81.Month;

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
    public int getSalary(Month[] monthArray) {
        int totalSalary = 0;
        for (Month month: monthArray) {
            totalSalary += month.workDays * getSalaryPerDay();
        }
    return totalSalary;
    }
}



/*Задача №2

Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
Все поля сделать приватными и для каждого поля добавить методы set и get.
Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
*/