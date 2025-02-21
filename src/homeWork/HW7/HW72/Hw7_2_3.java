package homeWork.HW7.HW72;

public class Hw7_2_3 {


    public static void main(String[] args) {

        int n=10;
        for (int i = 0; i < 10; i++) {
            System.out.print("  ".repeat(i));
            for (int k = 0; k < n; k++) {
                System.out.print(k);
                if (k < n - 1) {
                    System.out.print(" ");
                }
            }

            for (int k = n - 2; k >= 0; k--) {
                System.out.print(" " + k);
            }

            System.out.println();
            n--;
        }
    }
}


/*Вывести следующие строки с соответствующим форматированием (как пирамиды):


Задача №3

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
      7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
         6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
               4 3 2 1 0 1 2 3 4
                  3 2 1 0 1 2 3
                     2 1 0 1 2
                        1 0 1
                           0
*/