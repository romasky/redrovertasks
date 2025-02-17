package test.loops;

public class ForLoopLecture {

    public static void main(String[] args) {
        System.out.println("Лекция по циклу for в Java\n");
        explainFor();
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
    }

    // Объяснение цикла for
    public static void explainFor() {
        System.out.println("Цикл for используется для повторения блока кода несколько раз.\n" +
                "Структура цикла for выглядит так:\n" +
                "for (инициализация; условие; шаг) {\n" +
                "    // блок кода, который выполняется на каждой итерации\n" +
                "}\n");
        System.out.println("1. Инициализация — выполняется один раз перед началом цикла.\n" +
                "2. Условие — проверяется перед каждой итерацией, если условие ложное, цикл завершится.\n" +
                "3. Шаг — выполняется после каждой итерации, чаще всего используется для изменения переменной счётчика.\n");
        System.out.println("Цикл for часто используется, когда известно, сколько раз нужно повторить блок кода.\n");
    }

    // Пример 1: Простой цикл for
    public static void example1() {
        System.out.println("\nПример 1: Простой цикл for\n");

        // Цикл for от 1 до 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  // Печатаем текущее значение i
        }

        System.out.println("Цикл завершён, i = 6\n");
    }

    // Пример 2: Использование цикла for для суммирования чисел
    public static void example2() {
        System.out.println("\nПример 2: Использование цикла for для суммирования чисел от 1 до 5\n");

        int sum = 0;  // Переменная для хранения суммы
        for (int i = 1; i <= 5; i++) {
            sum += i;  // Добавляем i к сумме
        }

        System.out.println("Сумма чисел от 1 до 5: " + sum + "\n");
    }

    // Пример 3: Цикл for с шагом больше 1
    public static void example3() {
        System.out.println("\nПример 3: Цикл for с шагом больше 1\n");

        // Цикл for с шагом 2
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);  // Печатаем значения i с шагом 2
        }

        System.out.println("Цикл завершён\n");
    }

    // Пример 4: Вложенные вычисления в условии цикла
    public static void example4() {
        System.out.println("Пример 4: Вложенные вычисления в условии цикла");

        // Цикл с вычислениями внутри условия и инкрементом
        for (int i = 1, j = 10; i <= 100 && j > 0; i += (i % 2 == 0 ? 3 : 2), j -= (i % 2 == 0 ? 1 : 2)) {
            System.out.println("i: " + i + ", j: " + j);
        }

        /*Пояснение: В данном примере мы начинаем с двух переменных i и j, при этом i начинается с 1, а j с 10.
	•	Условие i <= 100 && j > 0 продолжает выполнение цикла, пока i меньше или равно 100 и j больше 0.
	•	Шаг изменения переменной i зависит от её текущего значения: если i чётное, то увеличиваем на 3, если нечётное — на 2.
	•	Шаг изменения переменной j также зависит от значения i: если i чётное, уменьшаем j на 1, если нечётное — на 2.*/
    }


    // Пример 4: Вложенные циклы для построения пирамиды чисел
    public static void example5() {
        int rows = 5; // Количество рядов

        for (int i = 1; i <= rows; i++) {
            // Печатаем пробелы перед числами для выравнивания
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Печатаем пробел
            }

            // Печатаем числа в каждом ряду
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*"); // Печатаем число
            }

            // Переход на новую строку
            System.out.println();
        }
    }


    public static void example6() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows - i)); // Печатаем пробелы
            System.out.println("*".repeat(i * 2 - 1)); // Печатаем звезды
        }
    }


    public static void example7() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows + i - 1; j++) {
                System.out.print(j < rows - i ? " " : "*");
            }
            System.out.println();
        }
    }


}