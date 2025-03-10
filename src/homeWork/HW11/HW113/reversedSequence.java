package homeWork.HW11.HW113;

public class reversedSequence {

    public static int[] reverse(int n){
        int[] sum = new int[n];
        for (int i = n-1, value = 1; i >= 0; i--, value++) {
            sum[i]=value;
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(reverse(5));
    }
}



/*Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
*/