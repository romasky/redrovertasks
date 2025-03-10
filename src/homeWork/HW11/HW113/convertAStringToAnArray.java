package homeWork.HW11.HW113;

import java.util.Arrays;

public class convertAStringToAnArray {

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
    }

}
