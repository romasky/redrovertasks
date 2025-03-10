package homeWork.HW10.HW103;

public class switchStatement {

    // Метод с использованием switch statement
    public static String convertNumericGrade(int grade) {
        String result;

        switch (grade) {
            case 1:
                result = "плохо";
                break;
            case 2:
                result = "неудовлетворительно";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 4:
                result = "хорошо";
                break;
            case 5:
                result = "отлично";
                break;
            default:
                result = "Некорректная оценка";
        }

        return result;
    }
}
