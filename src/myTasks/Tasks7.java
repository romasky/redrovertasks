package myTasks;

public class Tasks7 {

    public static void main(String[] args) {
        // 1. Поиск минимального и максимального значения в массиве
        int[] numbers = {3, 8, 1, 6, 2, 9, 4};
        int[] minMax = findMinMax(numbers);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);

        // 2. Разворот строки
        String reversed = reverseString("Hello");
        System.out.println("Reversed: " + reversed);

        // 3. Подсчёт количества вхождений символа в строке
        int count = countCharOccurrences("banana", 'a');
        System.out.println("Occurrences of 'a': " + count);

        // 4. Поиск среднего арифметического массива
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

        // 5. Объединение двух массивов
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] merged = mergeArrays(array1, array2);
        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Проверка, является ли число простым
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 10 prime? " + isPrime(10));

        // 7. Замена пробелов в строке на подчеркивания
        String replaced = replaceSpaces("Java is cool");
        System.out.println("Replaced: " + replaced);
    }

    // 1. Поиск минимального и максимального значения в массиве
    public static int[] findMinMax(int[] array) {
        int min = array[0], max = array[0];
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    // 2. Разворот строки
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; // Конкатенация символов
        }
        return reversed;
    }

    // 3. Подсчёт количества вхождений символа в строке
    public static int countCharOccurrences(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) count++;
        }
        return count;
    }

    // 4. Поиск среднего арифметического массива
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // 5. Объединение двух массивов
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    // 6. Проверка, является ли число простым
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 7. Замена пробелов в строке на подчеркивания
    public static String replaceSpaces(String str) {
        return str.replace(" ", "_");
    }
}