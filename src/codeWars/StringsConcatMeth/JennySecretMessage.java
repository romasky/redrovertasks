package codeWars.StringsConcatMeth;

public class JennySecretMessage {
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        } else return String.format("Hello, %s!", name);
    }


    public static void main(String[] args) {
        System.out.println(greet("Johnny"));
        System.out.println(greet("Alex"));
    }
}





//Jenny's secret message
//https://www.codewars.com/kata/55225023e1be1ec8bc000390