package test.lessons;

import java.util.Arrays;

public class MainFourthLesson {
    public static void main(String[] args) {
        String string = "Hello, world!";

        int[][] caloriesData = {
                {402, 735, 648},
                {},
                {488, 320, 402},
                {421, 766, 514, 570, 406, 371},
                {630, 758},
                {672, 399, 659},
                {451, 430, 449},
                {608, 557, 643},
                {791, 713, 593},
                {100, 4, 700}
        };

        int[] dailytotals = new int[caloriesData.length];
        for (int i = 0; i < caloriesData.length; i++) {
            int sum = 0;
            for (int j = 0; j < caloriesData[i].length; j++) {
                sum += caloriesData[i][j];
            }
            dailytotals[i] = sum;
        }
        System.out.println(Arrays.toString(dailytotals));



        int maxDailyCallories = 0;
        for (int i = 0; i < caloriesData.length; i++) {
            int sum = 0;
            for (int j = 0; j < caloriesData[i].length; j++) {
                if (caloriesData[i][j]>maxDailyCallories){
                    maxDailyCallories = caloriesData[i][j];
                }
            }
        }
        System.out.println(maxDailyCallories);


    }





}




