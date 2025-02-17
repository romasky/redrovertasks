package test.loops;

public class WhileLoopExamples {

    public static void main(String[] args) {
        simpleWhileExample();
        countdownExample();
        sumNumbersExample();
        complexWhileExample();
    }

    // Простейший пример: вывод чисел от 1 до 5
    public static void simpleWhileExample() {
        System.out.println("Простой while:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
    }

    // Пример: Обратный отсчёт от 10 до 1
    public static void countdownExample() {
        System.out.println("Обратный отсчет:");
        int n = 10;
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println("\n");
    }

    // Пример: Суммирование чисел от 1 до 100
    public static void sumNumbersExample() {
        System.out.println("Сумма чисел от 1 до 100:");
        int sum = 0, num = 1;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("Сумма: " + sum + "\n");
    }

    // Сложный пример: поиск первого числа, делящегося на 7 и 9
    public static void complexWhileExample() {
        System.out.println("Поиск первого числа, делящегося на 7 и 9:");
        int x = 1;
        while (true) { // Бесконечный цикл (пока не найдем нужное число)
            if (x % 7 == 0 && x % 9 == 0) {
                System.out.println("Найдено число: " + x);
                break; // Выход из цикла
            }
            x++;
        }
    }
}