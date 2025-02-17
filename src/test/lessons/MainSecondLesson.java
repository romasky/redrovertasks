package test.lessons;

import java.util.Scanner;

public class MainSecondLesson {


    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int summ;

        do {                                                    // Цикл do while будет выполняться постоянно, пока сумма чисел не будет равна 6
            System.out.println("Введите число kubik1: ");
            int kubik1 = keyboard.nextInt();
            System.out.println("Введите число kubik2: ");
            int kubik2 = keyboard.nextInt();
            summ = kubik1 + kubik2;
            System.out.println("Сумма чисел: " + summ);
        } while (summ != 6);

    }
}
