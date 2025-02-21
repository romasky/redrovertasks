package homeWork.HW7.HW71;

public class Hw7_1_3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min=array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}


/*Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*/