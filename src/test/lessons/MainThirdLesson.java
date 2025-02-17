package test.lessons;

import java.util.Arrays;

public class MainThirdLesson {

    public static void main(String[] args) {

        int[] massive = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i]=i;
        }

        massive[0]=12;

        //System.out.println(Arrays.toString(massive));

//        for (int i = 0; i < massive.length; i++) {
//            System.out.print(massive[i]+" ");
//        }

        int[] array = {1, 2, 3, 4, 5};

        int[] array1;
        array1 = new int[]{1, 2, 3, 4, 5};


        int[] array3 = {4, 9, 0, 1};
        int[] array4 = array3;

        array4[2]=23;

        System.out.println(array4[2]);
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));





    }
}
