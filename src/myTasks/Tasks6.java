package myTasks;

public class Tasks6 {

    public static void main(String[] args) {

        // 6.1 Вывод всех элементов массива
        System.out.println("Задача 6.1: Вывод всех элементов массива");
        int[] array7 = {1, 2, 3, 4, 5};
        for (int num : array7) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 6.2 Поиск суммы элементов массива
        System.out.println("Задача 6.2: Сумма элементов массива");
        int[] array8 = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : array8) {
            sum += num;
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println();

        // 6.3 Нахождение минимального и максимального значения в массиве
        System.out.println("Задача 6.3: Минимум и максимум массива");
        int[] array9 = {45, 23, 12, 67, 89, 4};
        int min = array9[0], max1 = array9[0];
        for (int num : array9) {
            if (num < min) min = num;
            if (num > max1) max1 = num;
        }
        System.out.println("Минимум: " + min + ", Максимум: " + max1);
        System.out.println();

        // 6.4 Обратный порядок массива
        System.out.println("Задача 6.4: Обратный порядок массива");
        int[] array10 = {1, 2, 3, 4, 5};
        for (int i = array10.length - 1; i >= 0; i--) {
            System.out.print(array10[i] + " ");
        }
        System.out.println("\n");

        // 6.5 Поиск первого и последнего вхождения элемента в массив
        System.out.println("Задача 6.5: Первое и последнее вхождение");
        int[] array11 = {1, 2, 3, 4, 2, 5, 2};
        int target = 2;
        int firstIndex = -1, lastIndex = -1;
        for (int i = 0; i < array11.length; i++) {
            if (array11[i] == target) {
                if (firstIndex == -1) firstIndex = i;
                lastIndex = i;
            }
        }
        if (firstIndex != -1) {
            System.out.println("Первое вхождение: " + firstIndex);
            System.out.println("Последнее вхождение: " + lastIndex);
        } else {
            System.out.println("Число не найдено");
        }
        System.out.println();

        // 6.6 Удаление дублирующихся элементов в массиве
        System.out.println("Задача 6.6: Удаление дубликатов");
        int[] array12 = {1, 2, 2, 3, 4, 5, 5, 6};

        // Массив для хранения уникальных элементов
        int[] resultArray = new int[array12.length];
        int resultCount = 0;

        for (int i = 0; i < array12.length; i++) {
            boolean isDuplicate = false;
            // Проверяем, не встречался ли элемент ранее
            for (int j = 0; j < resultCount; j++) {
                if (array12[i] == resultArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // Если элемента нет в новом массиве, добавляем его
            if (!isDuplicate) {
                resultArray[resultCount] = array12[i];
                resultCount++;
            }
        }

        // Выводим массив без дубликатов
        for (int i = 0; i < resultCount; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();

    }
}
