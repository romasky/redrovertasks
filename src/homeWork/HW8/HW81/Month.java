package homeWork.HW8.HW81;

public class Month {
    public String monthName;
    public int monthDays;
    public int workDays;

    public Month(String monthName, int monthDays, int workDays) {
        this.monthName = monthName;
        this.monthDays = monthDays;
        this.workDays = workDays;
    }
}


/*Задача №1
Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
*/