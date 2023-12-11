package homework;

public class HomeworkSolution14 {
    // Задача 1: Вычисление Максимального Числа с использованием Math.max и тернарного оператора
    public static int findMax(int a, int b, int c) {
        // return Math.max(Math.max(a, b), c);
        return a > b ?
                (a > c ? a : c) :
                (b > c ? b : c) ;

    }

    // Задача 2: Поиск Самого Длинного Слова в Строке
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Задача 3: Вычисление Индекса Массы Тела
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Задача 4: Конвертация Секунд в Форматированное Время
    public static String convertSecondsToFormattedTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, sec);
    }

    // Задача 5: Вычисление Площади Фигур
    public static double calculateArea(double[] dimensions) {
        switch (dimensions.length) {
            case 1: // Круг
                return Math.PI * dimensions[0] * dimensions[0];
            case 2: // Прямоугольник
                return dimensions[0] * dimensions[1];
            case 3: // Треугольник (формула Герона)
                double s = (dimensions[0] + dimensions[1] + dimensions[2]) / 2;
                return Math.sqrt(s * (s - dimensions[0]) * (s - dimensions[1]) * (s - dimensions[2]));
            default:
                return -1; // Некорректный ввод данных
        }
    }
}
