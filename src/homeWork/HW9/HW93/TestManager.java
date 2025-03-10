package homeWork.HW9.HW93;

import homeWork.HW9.HW92.Employee;

public class TestManager {


    public static void main(String[] args) {


        Employee emp = new Employee("Alice", 30, "Female", 100);
        Manager manager = emp.convertToManager(5);

        System.out.println(manager.getName());
        System.out.println(manager.getCountOfEmployees());
    }
}
