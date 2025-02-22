package homeWork.HW8.HW83;

import homeWork.HW8.HW81.Month;
import homeWork.HW8.HW81.MonthUtils;
import homeWork.HW8.HW82.Employee;

public class TestManager {

    public static void main(String[] args) {
        MonthUtils monthUtils = new MonthUtils();
        Manager Petya = new Manager();
        Petya.setAge(21);
        Petya.setName("Petya");
        Petya.setSex("Male");
        Petya.setSalaryPerDay(12);
        Petya.setcountOfEmployees(3);

        System.out.println("Employee name: "+Petya.getName());
        System.out.println("Petya age: "+Petya.getAge());
        System.out.println("Petya sex: "+Petya.getSex());
        System.out.println("Petya salary per day: "+Petya.getSalaryPerDay());
        System.out.println("Petya count of employees: "+Petya.getcountOfEmployees());
        System.out.println("Petya salary for 3 months: "+Petya.getSalary(new Month[]{monthUtils.months[0], monthUtils.months[1], monthUtils.months[2]}));


    }
}
