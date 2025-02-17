package test.arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayExamples {

    public static void main(String[] args) {
        basicArrayOperations();
        arraySorting();
        arraySearch();
        arrayCopying();
        arrayFilling();
        arrayComparison();
        multidimensionalArrays();
        dynamicArrayOperations();
    }

    // 1. Основные операции с массивами
    public static void basicArrayOperations() {
        System.out.println("Основные операции с массивами:");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Доступ к элементу по индексу
        System.out.println("Элемент по индексу 2: " + numbers[2]);

        // Изменение элемента
        numbers[2] = 35;
        System.out.println("После изменения: " + Arrays.toString(numbers));

        // Длина массива
        System.out.println("Длина массива: " + numbers.length + "\n");
    }

    // 2. Сортировка массива
    public static void arraySorting() {
        System.out.println("Сортировка массива:");

        int[] numbers = {50, 10, 40, 30, 20};

        // Сортировка по возрастанию
        Arrays.sort(numbers);
        System.out.println("Сортировка по возрастанию: " + Arrays.toString(numbers));

        // Сортировка в обратном порядке (используем ArrayList)
        Integer[] numObj = {50, 10, 40, 30, 20}; // Преобразуем в Integer (нельзя примитивный int)
        Arrays.sort(numObj, Collections.reverseOrder());
        System.out.println("Сортировка по убыванию: " + Arrays.toString(numObj) + "\n");
    }

    // 3. Поиск в массиве
    public static void arraySearch() {
        System.out.println("Поиск в массиве:");

        int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;

        // Линейный поиск
        boolean found = false;
        for (int num : numbers) {
            if (num == key) {
                found = true;
                break;
            }
        }
        System.out.println("Число " + key + (found ? " найдено" : " не найдено"));

        // Бинарный поиск (только в отсортированном массиве)
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("Бинарный поиск: " + (index >= 0 ? "Найдено на индексе " + index : "Не найдено") + "\n");
    }

    // 4. Копирование массива
    public static void arrayCopying() {
        System.out.println("Копирование массива:");

        int[] original = {1, 2, 3, 4, 5};

        // Копирование всего массива
        int[] copy1 = Arrays.copyOf(original, original.length);
        System.out.println("Полное копирование: " + Arrays.toString(copy1));

        // Копирование части массива
        int[] copy2 = Arrays.copyOfRange(original, 1, 4);
        System.out.println("Копирование части массива (с 1 по 3 индекс): " + Arrays.toString(copy2));

        // Копирование с System.arraycopy()
        int[] copy3 = new int[original.length];
        System.arraycopy(original, 0, copy3, 0, original.length);
        System.out.println("Копирование через System.arraycopy(): " + Arrays.toString(copy3) + "\n");
    }

    // 5. Заполнение массива определённым значением
    public static void arrayFilling() {
        System.out.println("Заполнение массива:");

        int[] numbers = new int[5];

        // Заполнение числами 7
        Arrays.fill(numbers, 7);
        System.out.println("Массив после заполнения: " + Arrays.toString(numbers) + "\n");
    }

    // 6. Сравнение массивов
    public static void arrayComparison() {
        System.out.println("Сравнение массивов:");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        // Сравнение с Arrays.equals()
        System.out.println("array1 == array2: " + Arrays.equals(array1, array2));
        System.out.println("array1 == array3: " + Arrays.equals(array1, array3) + "\n");
    }

    // 7. Двумерные массивы
    public static void multidimensionalArrays() {
        System.out.println("Двумерные массивы:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    // 8. Динамические массивы (ArrayList)
    public static void dynamicArrayOperations() {
        System.out.println("Работа с ArrayList:");

        ArrayList<String> names = new ArrayList<>();

        // Добавление элементов
        names.add("Алиса");
        names.add("Боб");
        names.add("Чарли");

        System.out.println("Список после добавления: " + names);

        // Вставка элемента
        names.add(1, "Дэвид");
        System.out.println("После вставки: " + names);

        // Удаление элемента по индексу
        names.remove(2);
        System.out.println("После удаления по индексу: " + names);

        // Проверка наличия элемента
        System.out.println("Есть ли 'Боб' в списке? " + names.contains("Боб"));

        // Получение элемента
        System.out.println("Элемент на индексе 1: " + names.get(1));

        // Изменение элемента
        names.set(0, "Анна");
        System.out.println("После изменения: " + names);

        // Размер списка
        System.out.println("Размер списка: " + names.size() + "\n");
    }
}