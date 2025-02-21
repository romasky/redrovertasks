package codeWars.StringsConcatMeth;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        String s = "Sam Harris";
        String output = s.toUpperCase().charAt(0) + "." + s.toUpperCase().charAt(s.indexOf(" ") + 1);
        System.out.println(output);
    }
}

//Abbreviate a Two Word Name
//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3