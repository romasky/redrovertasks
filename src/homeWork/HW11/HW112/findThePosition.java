package homeWork.HW11.HW112;

public class findThePosition {
    public static String position(char alphabet)
    {
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] == alphabet) {
                return "Position of alphabet: " + (i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(position('d'));
    }
}
