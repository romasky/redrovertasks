package test.strings;

import java.util.Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String string = "Hello, world!";



        System.out.println(string);
        // 1. Получение длины строки
        System.out.println("1. Length: " + string.length());

        // 2. Проверка пустая ли строка
        System.out.println("2. Is empty: " + string.isEmpty());

        // 3. Проверка, состоит ли строка только из пробелов
        System.out.println("3. Is blank: " + string.isBlank());

        // 4. Получение символа по индексу
        System.out.println("4. Char at index 1: " + string.charAt(1));

        // 5. Получение подстроки
        System.out.println("5. Substring (7-12): " + string.substring(7, 12));
        System.out.println("5.1. Substring (end-4): " + string.substring(string.length()-4));

        // 6. Замена символов или подстрок
        System.out.println("6. Replace 'world' with 'Java': " + string.replace("world", "Java"));

        // 7. Преобразование в верхний и нижний регистр
        System.out.println("7. Uppercase: " + string.toUpperCase());
        System.out.println("7.1 Lowercase: " + string.toLowerCase());

        // 8. Проверка, начинается или заканчивается ли строка на подстроку
        System.out.println("8.1 Starts with 'Hello': " + string.startsWith("Hello"));
        System.out.println("8.1 Ends with 'world!': " + string.endsWith("world!"));

        // 9. Поиск подстроки
        System.out.println("9.1 Index of 'world': " + string.indexOf("world"));
        System.out.println("9.1 Last index of 'o': " + string.lastIndexOf('o'));

        // 10. Удаление пробелов с начала и конца
        String stringWithSpaces = "   Trim me!   ";
        System.out.println("10. Trimmed: '" + stringWithSpaces.trim() + "'");

        // 11. Разделение строки по разделителю
        String[] words = string.split(", ");
        System.out.println("11. Split result: "+ Arrays.toString(words));
        System.out.println("11.1 " + words.length);

        // 12. Сравнение строк (проверяет, одинаковы ли строки. С учетом регистра или без)
        System.out.println("12.1 Equals 'Hello, world!': " + string.equals("Hello, world!"));
        System.out.println("12.2 EqualsIgnoreCase 'hello, world!': " + string.equalsIgnoreCase("hello, world!"));

        // 13. Проверка, содержит ли строка подстроку
        System.out.println("13.1 Contains 'world': " + string.contains("world"));
        System.out.println("13. " +string.toLowerCase().contains("ORL".toLowerCase()));

        // 14. Преобразование числа в строку
        int number = 123;
        String numberString = String.valueOf(number);
        System.out.println("14. String.valueOf(123): " + numberString);

        // 15. Повторение строки (Java 11+)
        System.out.println("15. Repeated 3 times: " + "Hi! ".repeat(3));

        // 16. Объединение строк
        System.out.println("16. Concatenation: " + string.concat(" How are you?"));

        // 17. Преобразование строки в массив символов
        char[] charArray = string.toCharArray();
        System.out.println("17. First char in array: " + charArray[0]);

        //18. Метод compareTo() сравнивает две строки лексикографически Когда использовать?
        //	•	compareTo() → когда нужно сортировать строки.
        //	•	equals() → когда нужно проверить, одинаковые ли строки.
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";

        System.out.println("17.1 " + str1.compareTo(str2)); //"Apple".compareTo("Banana") вернуло -1, потому что “A” в алфавите идет раньше, чем “B”.
        System.out.println("17.2 " + str2.compareTo(str1)); //"Banana".compareTo("Apple") вернуло 1, потому что “B” идет после “A”.
        System.out.println("17.3 " + str1.compareTo(str3)); //"Apple".compareTo("Apple") вернуло 0, так как строки одинаковые.
    }
}