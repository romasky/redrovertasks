package myTasks;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {

        // 2.1 Объявление переменных всех примитивных типов
        byte b2 = 100;
        short s = 30000;
        int i = 100000;
        long l = 1000000000L;
        float f = 3.14f;
        double d2 = 3.14159;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b2);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d2);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println();

        // 2.2 Использование Integer.MAX_VALUE и Integer.MIN_VALUE
        System.out.println("int max: " + Integer.MAX_VALUE);
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        System.out.println("long min: " + Long.MIN_VALUE);
        System.out.println("short max: " + Short.MAX_VALUE);
        System.out.println("short min: " + Short.MIN_VALUE);
        System.out.println("byte max: " + Byte.MAX_VALUE);
        System.out.println("byte min: " + Byte.MIN_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE);
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE);
        System.out.println("double min: " + Double.MIN_VALUE);
        System.out.println();

        // 2.3 Переполнение byte
        byte b3 = 127;
        b3++;
        System.out.println("Значение после переполнения: " + b3);
        System.out.println();

        // 2.4 Четное или нечетное число
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = sc.nextInt();
        if (inputNumber % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
        System.out.println();

        // 2.5 Конвертация типов
        double d3 = 9.99;
        int i3 = (int) d3;
        System.out.println("Конвертация из double в int: " + i3);
    }
}
