package homeWork.HW6;

import java.util.Arrays;

public class Hw6_4 {
    public static void main(String[] args) {
        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"},};
        int sum = 0;
        for (String[] strings : array) {
            String str1 = "";
            for (String string : strings) {
                str1+=string+"";
            }
            sum++;
            for(int k=0; k<str1.length(); k++){
                if (str1.charAt(k) == 'е'){
                    sum--;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}



/*Экстра задача

Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

* */