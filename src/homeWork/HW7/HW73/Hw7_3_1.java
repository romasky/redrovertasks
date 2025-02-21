package homeWork.HW7.HW73;

public class Hw7_3_1 {

    public static double addNumbers(double a, double b) {
        return a+b;
    }

    public static double subtractNumbers(double a, double b) {
        return a-b;
    }

    public static double multiplyNumbers(double a, double b) {
        return a*b;
    }

    public static double divideNumbers(double a, double b) {
        return a/b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(addNumbers(2.54,3.47));
        System.out.println(subtractNumbers(8.54,3.47));
        System.out.println(multiplyNumbers(2.54,3.47));
        System.out.println(divideNumbers(2.54,0));
    }
}


/*Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел

* */