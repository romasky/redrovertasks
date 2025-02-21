package homeWork.HW7.HW73;

public class Hw7_3_2_5 {

    public static String countingSheep(int num) {
        String s = "";
        for (int i = 1; i <= num; i++) {
            s += i+" sheep...";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}



/*https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

*If you can't sleep, just count sheeps!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
* Input will always be valid, i.e. no negative integers.
* */