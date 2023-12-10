package homework;

public class HomeworkSolution14 {
    public static void main(String[] args) {
        // Примеры вызова методов
        System.out.println("Can triangle exist: " + canTriangleExist(3, 4, 5));
        System.out.println("Merged string: " + mergeStrings("aaaa", "bbbbbb"));
        System.out.println("Average: " + calculateAverage(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Is sum even: " + isSumEven(3, 5));
        System.out.println("Converted seconds: " + convertSeconds(3661));
        System.out.println(calculateArea(3)); // Круг
        System.out.println(calculateArea(3, 4)); // Прямоугольник
        System.out.println(calculateArea(3, 4, 5)); // Треугольник
        System.out.println(calculateArea(1, 2, 3, 4)); // Некорректное количество размеров
    }

    // Задача 1: Проверка существования треугольника
    public static boolean canTriangleExist(int a, int b, int c) {
        // Треугольник существует, если сумма любых двух сторон больше третьей
        return a + b > c && a + c > b && b + c > a;
    }

    // Задача 2: Объединение строк с изменением регистра
    public static String mergeStrings(String first, String second) {
        // Обрезаем первую строку до её половины, преобразуем в нижний регистр
        // Обрезаем вторую строку до её половины, преобразуем в верхний регистр
        // Объединяем обе половины
        return first.substring(0, first.length() / 2).toLowerCase() +
                second.substring(second.length() / 2).toUpperCase();
    }

    // Задача 3: Вычисление среднего арифметического
    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number; // Суммируем все числа
        }
        return sum / numbers.length; // Делим сумму на количество чисел
    }

    // Задача 4: Определение четности суммы чисел
    public static boolean isSumEven(int a, int b) {
        return (a + b) % 2 == 0; // Сумма чётная, если делится на 2 без остатка
    }

    // Задача 5: Преобразование секунд в часы, минуты и секунды
    public static String convertSeconds(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }

    // Задача 6: Вычисление площади различных фигур
    public static double calculateArea(double... dimensions) {
        switch (dimensions.length) {
            case 1:
                return printCircleArea(dimensions[0]);
            case 2:
                return printRectangleArea(dimensions[0], dimensions[1]);
            case 3:
                return printTriangleArea(dimensions[0], dimensions[1], dimensions[2]);
            default:
                System.out.println("Некорректное количество размеров.");
                return -1;
        }
    }

    private static double printCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double printRectangleArea(double length, double width) {
        return length * width;
    }

    private static double printTriangleArea(double a, double b, double c) {
        if (!canTriangleExist((int)a, (int)b, (int)c)) {
            System.out.println("Треугольник не может существовать.");
            return -1;
        }
        double s = (a + b + c) / 2; // Полупериметр
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
        return area;
    }
}

