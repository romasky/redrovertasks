package homeWork.HW7.HW72;

public class Hw7_2_1 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(k);
                if (k < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            n--;
        }
    }
}



/*Вывести следующие строки с соответствующим форматированием (как пирамиды):


Задача №1

0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0
*/
