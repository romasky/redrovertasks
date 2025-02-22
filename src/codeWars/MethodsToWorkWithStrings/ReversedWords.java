package codeWars.MethodsToWorkWithStrings;

public class ReversedWords {


    public static String reverseWords(String str){
    String[] words = str.split(" ");
    String s = "";
        for(int i = words.length-1; i>=0; i--){
            s += words[i]+" ";
        }
        return s.trim();    //write your code here...
    }



    public static void main(String[] args) {

        System.out.println(reverseWords("hello world!")); // "world! hello"

    }
}


//Reversed Words
//https://www.codewars.com/kata/51c8991dee245d7ddf00000e