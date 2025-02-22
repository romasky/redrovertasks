package codeWars.MethodsToWorkWithStrings;

public class DuplicateEncoder {


    static String encode(String word){
        String s = word.toLowerCase();
        String finalStr = "";

        for (int i = 0; i < s.length(); i++) {
            int sum=0;
            for (int j = 0; j < s.length(); j++) {
                char sI = s.charAt(i);
                char sJ = s.charAt(j);
                if(sI==sJ) {
                    sum++;
                }
            }
            if(sum>1) {
                finalStr+=")";
            } else if (sum==1) finalStr+="(";
        }
        return finalStr;
    }
    public static void main(String[] args) {
        System.out.println(encode("Prood"));
    }
}



/*Duplicate Encoder

The goal of this exercise is to convert a string to a new string where each character in the new string is
 "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string.
  Ignore capitalization when determining if a character is a duplicate.


* https://www.codewars.com/kata/54b42f9314d9229fd6000d9c*/