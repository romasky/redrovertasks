package homeWork.HW7.HW73;

public class Hw7_3_2_4 {


    public static int findSmallestInt(int[] args) {
        int smallestNumber=args[0];
        for (int i = 0; i < args.length; i++) {
            if(smallestNumber>args[i]) {
                smallestNumber=args[i];
            }
        }
        return smallestNumber;
    }

    public static void main(String[] args) {
        int[] array1 = {34, 15, 88, 2};
        int[] array2 = {34, -345, -1, 100};

        System.out.println(findSmallestInt(array1));
        System.out.println(findSmallestInt(array2));

    }
}


/*https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
*Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
* */