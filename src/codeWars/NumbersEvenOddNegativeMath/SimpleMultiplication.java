package codeWars.NumbersEvenOddNegativeMath;

public class SimpleMultiplication {

    public static int simpleMultiplication(int n) {
        //your code here
        return n%2==0 ? n*8 : n*9;
    }


    public static void main(String[] args) {
        System.out.println(simpleMultiplication(5));
    }
}


//Simple multiplication
//https://www.codewars.com/kata/583710ccaa6717322c000105