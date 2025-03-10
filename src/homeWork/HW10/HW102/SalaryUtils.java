package homeWork.HW10.HW102;

import homeWork.HW9.HW91.Month;
import homeWork.HW10.HW101.Employee;

public class SalaryUtils {

    public double getTotalSalary(Employee[] employees, Month[] months) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary(months);
        }
        return totalSalary;
    }
}
