package homeWork.HW4;

public class Hw4_3 {
    public static void main(String[] args) {


        //first type
        for (int i = 40; i <=60 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(); //pass new line
        //second type
        for (int i = 40; i <=60 ; i=i+2) {
            System.out.print(i+" ");
        }
    }
}




/*Задача №3

Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).
 * */


