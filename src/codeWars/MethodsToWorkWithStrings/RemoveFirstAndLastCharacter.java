package codeWars.MethodsToWorkWithStrings;

public record RemoveFirstAndLastCharacter() {
    public static String remove(String str) {

        return  str.substring(1, str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(remove("hello"));
    }
}



//Remove First and Last Character
//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0