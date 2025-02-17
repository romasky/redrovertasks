package myTasks;

public class Tasks1 {
    public static void main(String[] args) {

        // 1.1 Объявление и вывод переменных типа int
        int a = 5, b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        // 1.2 Операции с переменными типа double
        double x = 10.5, y = 20.3, z = 30.7;
        System.out.println("Сумма: " + (x + y + z));
        System.out.println("Разность: " + (x - y - z));
        System.out.println("Произведение: " + (x * y * z));
        System.out.println("Частное: " + ((x + y) / z));
        System.out.println();

        // 1.3 Деление целых чисел
        int x1 = 7, y1 = 2;
        System.out.println("Результат деления x / y: " + x1 / y1);
        System.out.println("Точное деление: " + (double) x1 / y1);
        System.out.println();

        // 1.4 Обмен значений без третьей переменной
        x1 = x1 + y1; // x1 теперь 15
        y1 = x1 - y1; // y1 теперь 5
        x1 = x1 - y1; // x1 теперь 10
        System.out.println("После обмена: x = " + x1 + ", y = " + y1);
        System.out.println();

        // 1.5 Последняя цифра числа
        int number = 345;
        System.out.println("Последняя цифра числа: " + (number % 10));

    }
}
