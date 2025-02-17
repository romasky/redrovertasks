package homeWork.HW6;

import java.util.Arrays;

public class Hw6_5 {
    public static void main(String[] args) {
        int[][] arrayData = {
                {402, 735, 648},
                {488, 320, 402},
                {672, 399, 659},

        };

        int[][] reversedArray = new int[3][3];

        for (int i = 0; i < arrayData.length; i++) {
            for (int j = 0; j < arrayData[i].length; j++) {
                reversedArray[i][j]=arrayData[j][i];
            }
        }
        for (int[] row : reversedArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}




/*Экстра-экстра задача

Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так, чтобы количество строк и количество столбцов совпадало).

Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот. Внимание! Не надо менять структуру массива. Задание требует только переместить элементы массива.

Тип элементов массива может быть любой по вашему выбору.


* */