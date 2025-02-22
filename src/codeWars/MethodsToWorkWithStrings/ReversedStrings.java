package codeWars.MethodsToWorkWithStrings;

public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(solution("Hello!"));
    }
}



/*
* Reversed Strings
*https://www.codewars.com/kata/5168bb5dfe9a00b126000018
*
*
* */