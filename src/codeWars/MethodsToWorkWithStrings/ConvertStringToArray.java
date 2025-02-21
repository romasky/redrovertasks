package codeWars.MethodsToWorkWithStrings;

import java.util.Arrays;

public class ConvertStringToArray {

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
    }



}



//Convert a string to an array
//https://www.codewars.com/kata/57e76bc428d6fbc2d500036d