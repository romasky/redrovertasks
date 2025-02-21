package homeWork.HW7.HW71;

public class Hw7_1_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum=0;
        for(int i: array) {
            sum+=i;
        }
        System.out.println(sum/array.length);
    }
}



/*Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
*/