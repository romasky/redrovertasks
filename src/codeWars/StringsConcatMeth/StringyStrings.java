package codeWars.StringsConcatMeth;

public class StringyStrings {
    public static String stringy(int size) {
        String smth = "";
        for (int i = 0; i < size; i++) {
            smth = i%2==0 ? smth + "1" : smth + "0";
        }
        return smth;   // Your code here
    }
    public static void main(String[] args) {

        System.out.println(stringy(5));
    }
}


//Stringy Strings
//https://www.codewars.com/kata/563b74ddd19a3ad462000054