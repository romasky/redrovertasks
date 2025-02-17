package test.arrays;

import java.util.Arrays;

public class ArraysMethodsExample {
    public static void main(String[] args) {
        // 1. ОДНОМЕРНЫЙ МАССИВ
        int[] array1D = {5, 2, 8, 1, 3};

        // 2. ДВУМЕРНЫЙ МАССИВ
        int[][] array2D = {
                {3, 5, 1},
                {8, 2, 6},
                {4, 9, 7}
        };

        // 1️⃣ Вывод массива в строку
        System.out.println("1. Одномерный массив: " + Arrays.toString(array1D));

        // 2️⃣ Вывод двумерного массива в строку
        System.out.println("2. Двумерный массив: " + Arrays.deepToString(array2D));

        // 3️⃣ Сортировка массива
        Arrays.sort(array1D);
        System.out.println("3. Отсортированный массив: " + Arrays.toString(array1D));

        // 4️⃣ Сортировка части массива (с 1-го по 3-й индекс)
        int[] partialArray = {5, 2, 8, 1, 3, 6, 7};
        Arrays.sort(partialArray, 1, 4);
        System.out.println("4. Частично отсортированный массив: " + Arrays.toString(partialArray));

        // 5️⃣ Заполнение массива значением 9
        Arrays.fill(array1D, 9);
        System.out.println("5. Заполненный массив: " + Arrays.toString(array1D));

        // 6️⃣ Заполнение части массива
        Arrays.fill(array1D, 1, 4, 5);
        System.out.println("6. Частичное заполнение массива: " + Arrays.toString(array1D));

        // 7️⃣ Копирование массива полностью
        int[] copiedArray = Arrays.copyOf(array1D, array1D.length);
        System.out.println("7. Копия массива: " + Arrays.toString(copiedArray));

        // 8️⃣ Копирование части массива (первые 3 элемента)
        int[] copiedPartialArray = Arrays.copyOfRange(array1D, 0, 3);
        System.out.println("8. Копия части массива: " + Arrays.toString(copiedPartialArray));

        // 9️⃣ Поиск элемента (работает только с отсортированным массивом!)
        int[] searchArray = {1, 3, 5, 7, 9};
        Arrays.sort(searchArray);
        int index = Arrays.binarySearch(searchArray, 5);
        System.out.println("9. Элемент '5' найден на позиции: " + index);

        // 🔟 Проверка на равенство одномерных массивов
        boolean areEqual = Arrays.equals(array1D, copiedArray);
        System.out.println("10. Одинаковы ли массивы? " + areEqual);

        // 1️⃣1️⃣ Проверка равенства двумерных массивов
        int[][] anotherArray2D = {
                {3, 5, 1},
                {8, 2, 6},
                {4, 9, 7}
        };
        boolean are2DEqual = Arrays.deepEquals(array2D, anotherArray2D);
        System.out.println("11. Одинаковы ли двумерные массивы? " + are2DEqual);

        // 1️⃣2️⃣ Клонирование одномерного массива
        int[] clonedArray = array1D.clone();
        System.out.println("12. Клонированный массив: " + Arrays.toString(clonedArray));

        // 1️⃣3️⃣ Клонирование двумерного массива (поверхностное копирование)
        int[][] clonedArray2D = array2D.clone();
        System.out.println("13. Клонированный двумерный массив: " + Arrays.deepToString(clonedArray2D));

        // 1️⃣4️⃣ Заполнение двумерного массива
        int[][] filled2DArray = new int[3][3];
        for (int[] row : filled2DArray) {
            Arrays.fill(row, 7);
        }
        System.out.println("14. Заполненный двумерный массив: " + Arrays.deepToString(filled2DArray));

        // 1️⃣5️⃣ Печать хэш-кодов массивов
        System.out.println("15. HashCode array1D: " + Arrays.hashCode(array1D));
        System.out.println("16. HashCode array2D: " + Arrays.deepHashCode(array2D));

        // 1️⃣6️⃣ Разворот одномерного массива
        int[] array1Dv2 = {5, 2, 8, 1, 3};
        int[] result = new int[array1Dv2.length];
        for (int i = 0; i < array1Dv2.length; i++) {
            result[array1Dv2.length-i-1]=array1Dv2[i];
        }
        System.out.println("16. Развернутый массив: " + Arrays.toString(result));
    }


}