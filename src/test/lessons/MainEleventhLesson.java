package test.lessons;

public class MainEleventhLesson {


    public static int getSum(int a, int b) {
        return a + b;
    }


    public static boolean testSum() {
        if (getSum(5, 10) != 15) {
            return false;
        }
        if (getSum(0, 0) != 0) {
            return false;
        }
        if (getSum(-5, -10) != -15) {
            return false;
        }
        if (getSum(5, -10) != -5) {
            return false;
        }
        else {
            return true;
        }
    }




    public static void main(String[] args) {

        System.out.println(getSum(5, 10));
        System.out.println(testSum());
    }



}
