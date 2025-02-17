package homeWork.HW6;

public class Hw6_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        String s1 = s.toLowerCase();
        String s2 = "рит";
        for (int i = 0; i < s.length(); i++) {
            if(s1.substring(i).startsWith(s2)) {
                System.out.print(i+ " ");
            }
        }
    }
}


/*Задача №3

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
*/