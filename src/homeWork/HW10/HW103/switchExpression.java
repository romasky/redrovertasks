package homeWork.HW10.HW103;

public class switchExpression {


    // Метод с использованием switch expression
    public static String convertLetterGrade(char grade) {
        return switch (grade) {
            case 'F' -> "плохо";
            case 'C' -> "удовлетворительно";
            case 'B' -> "хорошо";
            case 'A' -> "отлично";
            default -> "Некорректная оценка";
        };
    }

}
