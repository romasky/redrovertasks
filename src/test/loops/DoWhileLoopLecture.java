package test.loops;

import java.util.Scanner;

public class DoWhileLoopLecture {

    public static void main(String[] args) {
        System.out.println("Лекция по циклу do-while в Java\n");
        explainDoWhile();
        example1();
        example2();
        example3();
    }

    // Объяснение цикла do-while
    public static void explainDoWhile() {
        System.out.println("Цикл do-while выполняет блок кода хотя бы один раз, а затем проверяет условие.\n" +
                "Основная структура цикла do-while:\n" +
                "do {\n" +
                "    // блок кода, который выполняется хотя бы один раз\n" +
                "} while (условие);\n");
        System.out.println("Если условие истинно, цикл продолжается. Если условие ложно, цикл завершится.\n");
        System.out.println("Важно: в отличие от while, do-while сначала выполняет код, а затем проверяет условие.\n");
    }

    // Пример 1: Простой цикл do-while
    public static void example1() {
        System.out.println("\nПример 1: Простой цикл do-while\n");

        int i = 1;  // Инициализация переменной

        // Цикл do-while
        do {
            System.out.println(i);  // Печатаем текущее значение i
            i++;  // Увеличиваем i на 1
        } while (i <= 5);  // Условие продолжения цикла (i должно быть меньше или равно 5)

        // После выполнения цикла программа продолжит выполнение дальше
        System.out.println("Цикл завершён, i = " + i + "\n");
    }

    // Пример 2: Использование do-while в условиях, когда нужно хотя бы один раз выполнить действие
    public static void example2() {
        System.out.println("\nПример 2: Использование do-while для запроса ввода от пользователя\n");

        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Введите команду (exit для выхода): ");
            userInput = scanner.nextLine();  // Чтение ввода
        } while (!userInput.equals("exit"));  // Повторять, пока не введено "exit"

        System.out.println("Программа завершена!");
    }

    // Пример 3: Пояснение отличия от while
    public static void example3() {
        System.out.println("\nПример 3: Отличие do-while от while\n");

        int i = 6;  // Инициализация переменной i

        // Цикл while
        while (i <= 5) {
            System.out.println(i);  // Это не выполнится, так как условие ложное с самого начала
            i++;
        }
        System.out.println("Цикл while завершён, i = " + i + "\n");

        // Цикл do-while (хотя условие ложное, выполнится хотя бы один раз)
        do {
            System.out.println(i);  // Печатает хотя бы один раз, даже если условие ложное
            i++;
        } while (i <= 5);  // Условие после выполнения
        System.out.println("Цикл do-while завершён, i = " + i + "\n");
    }
}
