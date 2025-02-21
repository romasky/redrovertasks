package homeWork.HW7.HW71;

public class Hw7_1_7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println("Elements in 2d array: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Elements in array # %d: %d\n", i+1, array[i].length);
        }
    }
}



/*Задача №7

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
*/