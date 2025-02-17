package test.lessons;

import java.util.Scanner;

public class MainFirstLesson {
    public static void main(String[] args) {
        System.out.println("1) " + "Hello\tRoman"); //Используем символ табуляции для отступа
        System.out.println("2) " + "Hello\nRoman"); //Используем символ переноса строки
        System.out.println("3) " + "Hello\rRoman"); //Используем символ возврата каретки
        System.out.println("4) " + "Hello\bRoman"); //Используем символ возврата на один шаг назад
        System.out.println("5) " + "Hello\fRoman"); //Используем символ перевода страницы
        System.out.println("6) " + "Hello\'Roman"); //Используем символ одинарной кавычки
        System.out.println("7) " + "Hello\"Roman"); //Используем символ двойной кавычки
        System.out.println("8) " + "Hello\\Roman"); //Используем символ обратной косой черты



        int x = readInt("Enter X: ");
        int y = readInt("Enter Y: ");

        if (x > y) {
            System.out.println("X is greater or equal to Y");
        } else if (x < y) {
            System.out.println("Y is greater than X");
        } else {
            System.out.println("X is equal to Y");
        }



        System.out.println(x+y);

    }


    static Scanner keyboard = new Scanner(System.in);

    private static int readInt(String message) {
        System.out.print(message);
        return keyboard.nextInt();
    }




}
