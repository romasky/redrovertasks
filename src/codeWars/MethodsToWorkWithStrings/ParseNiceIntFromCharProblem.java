package codeWars.MethodsToWorkWithStrings;

public class ParseNiceIntFromCharProblem {


    public static int howOld(final String herOld) {

        return Integer.parseInt(herOld.substring(0,1));

    }


    public static void main(String[] args) {
        System.out.println(howOld("1 year old"));
    }
}


/*Parse nice int from char problem
You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string.
For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.


https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
*/