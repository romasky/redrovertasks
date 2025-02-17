package homeWork.HW6;

public class Hw6_1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for(Character i : s.toCharArray()) {
            if(i == 'о') {
                System.out.print(i);
            }
        }
    }
}



/*Задача №1

Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)

* */
