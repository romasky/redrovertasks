package homeWork.HW6;

public class Hw6_2 {
    public static void main(String[] args) {

        String s = "Перевыборы выбранного президента";
        int sum = 0;
        for (Character i : s.toCharArray()) {
            if (i == 'е') {
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}


/*Задача №2

Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
*/