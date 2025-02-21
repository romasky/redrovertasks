package codeWars.StringsConcatMeth;

import java.util.Arrays;

public class ExesAndOhs {
    public static void main(String[] args) {
        String string = "xxxooo";
        String[] strings = string.split("");
        int sumX = 0;
        int sumY = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toLowerCase();
            if(strings[i].equals("x")) {
                sumX++;
            } else if(strings[i].equals("o")) {
                sumY++;
            }
        }
        if(sumX==sumY) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}


//Exes and Ohs
//https://www.codewars.com/kata/55908aad6620c066bc00002a
