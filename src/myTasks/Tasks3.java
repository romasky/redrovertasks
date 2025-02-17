package myTasks;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3.1 Проверка положительного числа
        int num1 = -5;
        if (num1 > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число не положительное");
        }
        System.out.println();

        // 3.2 Четное или нечетное число
        int num2 = 14;
        if (num2 % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
        System.out.println();

        // 3.3 Проверка пароля
        String correctPassword = "admin123";
        System.out.print("Введите пароль: ");
        String inputPassword = sc.next();
        if (inputPassword.equals(correctPassword)) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
        System.out.println();

        // 3.4 Логическое И (&&)
        int a2 = 10, b4 = 20;
        if (a2 > 5 && b4 > 5) {
            System.out.println("Оба числа больше 5");
        } else {
            System.out.println("Одно или оба числа не больше 5");
        }
        System.out.println();

        // 3.5 Логическое ИЛИ (||)
        int x2 = 7, y2 = 3;
        if (x2 > 5 || y2 > 5) {
            System.out.println("Есть число больше 5");
        }
        System.out.println();

        // 3.6 Отрицание (!)
        boolean isWeekend = false;
        if (!isWeekend) {
            System.out.println("Рабочий день");
        }
        System.out.println();

        // 3.7 Проверка диапазона
        int num3 = 50;
        if (num3 >= 10 && num3 <= 100) {
            System.out.println("Число в диапазоне от 10 до 100");
        } else {
            System.out.println("Число вне диапазона от 10 до 100");
        }
        System.out.println();

        // 3.8 Определение времени суток
        int hour = 15;
        if (hour >= 6 && hour <= 11) {
            System.out.println("Утро");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("День");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Вечер");
        } else {
            System.out.println("Ночь");
        }
        System.out.println();

        // 3.9 Проверка високосного года
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}
