package codeWars.StringsConcatMeth;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        String numbers = "1 2 3";
        String[] numbersArray = numbers.split(" ");
        int min = Integer.parseInt(numbersArray[0]);
        int max = Integer.parseInt(numbersArray[0]);
        for (int i = 0; i < numbersArray.length; i++) {
            int value = Integer.parseInt(numbersArray[i]);
            if(value<min) {
                min = value;
            } else if(value>max) {
                max = value;
            }
        }
        System.out.println(max + " " + min);
    }
}




//Highest and Lowest
//https://www.codewars.com/kata/554b4ac871d6813a03000035