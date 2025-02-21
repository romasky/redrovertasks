package codeWars.StringsConcatMeth;

public class MilesGallonKilometersLiter {


    public static double mpgToKPM(int mpg) {
        double gallon = 4.54609188;
        double mile = 1.609344;
        return Math.round((mpg * mile / gallon) * 100) / 100.0;
    }


    public static void main(String[] args) {
        System.out.println(mpgToKPM(10));
    }
}



//Miles per gallon to kilometers per liter
//https://www.codewars.com/kata/557b5e0bddf29d861400005d