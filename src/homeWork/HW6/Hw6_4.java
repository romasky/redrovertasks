package homeWork.HW6;

import java.util.Arrays;

public class Hw6_4 {
    public static void main(String[] args) {
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"},};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}



/*Экстра задача

Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

* */