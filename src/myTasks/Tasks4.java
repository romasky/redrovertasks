package myTasks;

import java.util.Scanner;

public class Tasks4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 4.1 Сумма чисел от 1 до N
        System.out.print("Введите число N для суммы: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i1 = 1; i1 <= N; i1++) {
            sum += i1;
        }
        System.out.println("Сумма чисел от 1 до " + N + ": " + sum);
        System.out.println();

        // 4.2 Вывод четных чисел от 1 до 20
        System.out.println("Четные числа от 1 до 20:");
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
        System.out.println();

        // 4.3 Подсчет количества цифр в числе
        System.out.print("Введите число для подсчета цифр: ");
        int X = sc.nextInt();
        int digitCount = 0;
        do {
            digitCount++;
            X /= 10;
        } while (X != 0);
        System.out.println("Количество цифр в числе: " + digitCount);
        System.out.println();

        // 4.4 Проверка простого числа
        System.out.print("Введите число для проверки на простоту: ");
        int N2 = sc.nextInt();
        boolean isPrime = true;
        for (int i2 = 2; i2 <= Math.sqrt(N2); i2++) {
            if (N2 % i2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
        System.out.println();

        // 4.5 Факториал числа
        System.out.print("Введите число для вычисления факториала: ");
        int N3 = sc.nextInt();
        long factorial = 1;
        for (int i4 = 1; i4 <= N3; i4++) {
            factorial *= i4;
        }
        System.out.println("Факториал числа: " + factorial);
        System.out.println();

        // 4.6 Таблица умножения
        System.out.println("Таблица умножения для 5:");
        for (int i4 = 1; i4 <= 10; i4++) {
            System.out.println("5 * " + i4 + " = " + (5 * i4));
        }
        System.out.println();

        //4.7 Вывести первые N чисел Фибоначчи
        int O = 10; // Количество чисел Фибоначчи
        int a = 0, b = 1;
        for (int i = 1; i <= O; i++) {
            System.out.print(a + " "); // Выводим текущее число Фибоначчи
            int next = a + b; // Следующее число Фибоначчи
            a = b; // Обновляем a
            b = next; // Обновляем b
        }
    }
}

