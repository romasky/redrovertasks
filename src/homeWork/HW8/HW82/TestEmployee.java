package homeWork.HW8.HW82;

import homeWork.HW8.HW81.Month;
import homeWork.HW8.HW81.MonthUtils;

public class TestEmployee {
    public static void main(String[] args) {
        MonthUtils monthUtils = new MonthUtils();
        Employee Vasya = new Employee();
        Vasya.setAge(21);
        Vasya.setName("Vasya");
        Vasya.setSex("Male");
        Vasya.setSalaryPerDay(12);

//        Month[] selectedMonths = {
//                monthUtils.months[0],  // January
//                monthUtils.months[1],  // February
//                monthUtils.months[2]   // March
//        };
        System.out.println("Employee name: "+Vasya.getName());
        System.out.println("Vasya age: "+Vasya.getAge());
        System.out.println("Vasya sex: "+Vasya.getSex());
        System.out.println("Vasya salary per day: "+Vasya.getSalaryPerDay());
        System.out.println("Vasya salary for 3 months: "+Vasya.getSalary(new Month[]{monthUtils.months[0], monthUtils.months[1], monthUtils.months[2]}));






    }


}
