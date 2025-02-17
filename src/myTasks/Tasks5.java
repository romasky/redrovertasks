package myTasks;

public class Tasks5 {

    public static void main(String[] args) {

        // 5.1 Создание массива чисел
        System.out.println("Задача 5.1: Массив чисел от 1 до 5");
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
        }
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println();

        // 5.2 Четные и нечетные ячейки массива
        System.out.println("Задача 5.2: Четные и нечетные ячейки");
        String[] array2 = new String[10];
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = "Чётный";
            } else {
                array2[i] = "Нечётный";
            }
        }
        for (String s : array2) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        System.out.println();

        // 5.3 Работаем с элементами массива
        System.out.println("Задача 5.3: Поменять знаки элементов массива");
        int[] array3 = {-1, 2, 3, -4, -5};
        for (int i = 0; i < array3.length; i++) {
            array3[i] = -array3[i];
        }
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println();

        // 5.4 Объединяем массивы
        System.out.println("Задача 5.4: Объединить два массива");
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] resultArray = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);

        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println();

        // 5.5 Перевернуть строку
        System.out.println("Задача 5.5: Перевернуть строку");
        String str = "hello";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed + "\n");
        System.out.println();

        // 5.6 Создать новый массив без повторяющихся элементов
        System.out.println("Задача 5.6: Уникальные элементы массива");
        int[] array4 = {1, 2, 3, 3, 4, 5, 5, 6};

        // Массив для хранения уникальных элементов
        int[] tempArray = new int[array4.length];
        int uniqueCount = 0;

        for (int i = 0; i < array4.length; i++) {
            boolean isDuplicate = false;
            // Проверяем, не встречался ли элемент ранее
            for (int j = 0; j < uniqueCount; j++) {
                if (array4[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // Если элемента нет в новом массиве, добавляем его
            if (!isDuplicate) {
                tempArray[uniqueCount] = array4[i];
                uniqueCount++;
            }
        }

        // Создаём итоговый массив нужной длины
        int[] uniqueArray = new int[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueArray, 0, uniqueCount);

        // Выводим уникальные элементы
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println();

        // 5.7 Заполнение двумерного массива числами по порядку
        System.out.println("Задача 5.7: Двумерный массив");
        int[][] array5 = new int[3][3];
        int value = 1;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = value++;
            }
        }
        for (int[] row : array5) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5.8 Поиск максимального элемента в двумерном массиве
        System.out.println("Задача 5.8: Максимум в двумерном массиве");
        int[][] array6 = {{5, 12, 3}, {8, 1, 6}, {11, 7, 2}};
        int max = array6[0][0];
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j] > max) {
                    max = array6[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println();

    }
}
