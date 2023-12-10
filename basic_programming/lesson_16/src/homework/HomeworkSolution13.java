package homework;

public class HomeworkSolution13 {
    // Задача 1: Проверка существования треугольника
    public static void canTriangleExist(int a, int b, int c) {
        // Треугольник существует, если сумма любых двух сторон больше третьей и все стороны больше 0
        boolean answer = (a + b > c && a + c > b && b + c > a) && (a > 0 && b > 0 && c > 0);
        System.out.println("Can triangle exist: " + answer);
    }

    // Задача 2: Объединение строк с изменением регистра
    public static void mergeStrings(String first, String second) {
        // Обрезаем первую строку до её половины, преобразуем в нижний регистр
        // Обрезаем вторую строку до её половины, преобразуем в верхний регистр
        // Объединяем обе половины
        String answer =  first.substring(0, first.length() / 2).toLowerCase() +
                second.substring(second.length() / 2).toUpperCase();
        System.out.println("Merged string: " + answer);

    }

    // Задача 3: Вычисление среднего арифметического
    public static void calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number; // Суммируем все числа
        }
        double answer =  sum / numbers.length; // Делим сумму на количество чисел
        System.out.println("Average: " + answer);
    }

    // Задача 4: Определение четности суммы чисел
    public static void isSumEven(int a, int b) {
        boolean answer =  (a + b) % 2 == 0; // Сумма чётная, если делится на 2 без остатка
        System.out.println("Is sum even: " + answer);
    }

    // Задача 5: Преобразование секунд в часы, минуты и секунды
    public static void convertSeconds(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        String answer =  String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
        System.out.println("Converted seconds: " + answer);
    }

    // Задача 6: Вычисление площади различных фигур
    public static void calculateArea(double[] dimensions) {
        switch (dimensions.length) {
            case 1:
                printCircleArea(dimensions[0]);
                break;
            case 2:
                printRectangleArea(dimensions[0], dimensions[1]);
                break;
            case 3:
                printTriangleArea(dimensions[0], dimensions[1], dimensions[2]);
                break;
            default:
                System.out.println("Некорректное количество размеров.");
        }
    }

    private static void printCircleArea(double radius) {
        System.out.println(Math.PI * radius * radius);
    }

    private static void printRectangleArea(double length, double width) {
        System.out.println(length * width);
    }

    private static void printTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // Полупериметр
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
        System.out.println(area);
    }
}

