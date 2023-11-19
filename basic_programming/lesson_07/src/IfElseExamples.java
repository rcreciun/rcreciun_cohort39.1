import java.util.Scanner;

public class IfElseExamples {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        discountCalculator();
        seasonDetector();
        rateConverter();
    }

    /**
     * Задача 1: Расчет Скидки в Магазине Программа для расчета скидки в магазине. Магазин предлагает различные скидки в
     * зависимости от суммы покупки: - При сумме покупки до 1000 единиц включительно скидка составляет 5%. - При сумме
     * покупки от 1001 до 5000 единиц скидка увеличивается до 10%. - При сумме покупки свыше 5000 единиц скидка
     * составляет 15%.
     */
    private static void discountCalculator() {

        // Пример 1: Расчет скидки в магазине
        System.out.println("Введите сумму покупки:");
        double purchaseAmount = scanner.nextDouble();
        double discount;
        if (purchaseAmount <= 1000) {
            discount = 0.05;
        } else if (purchaseAmount <= 5000) {
            discount = 0.10;
        } else {
            discount = 0.15;
        }
        System.out.println("Ваша скидка: " + (discount * 100) + "%");
        System.out.println("Итоговая сумма с учетом скидки: " + (purchaseAmount * (1 - discount)));
    }

    /**
     * ### Задача 2: Определение Времени Года Напишите программу, которая определяет время года по номеру месяца. -
     * Зима: декабрь (12), январь (1), февраль (2). - Весна: март (3), апрель (4), май (5). - Лето: июнь (6), июль (7),
     * август (8). - Осень: сентябрь (9), октябрь (10), ноябрь (11).
     */
    private static void seasonDetector() {
        // Пример 2: Определение времени года
        System.out.println("\nВведите номер месяца:");
        int month = scanner.nextInt();
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Зима";
        } else if (month >= 3 && month <= 5) {
            season = "Весна";
        } else if (month >= 6 && month <= 8) {
            season = "Лето";
        } else if (month >= 9 && month <= 11) {
            season = "Осень";
        } else {
            season = "Некорректный номер месяца";
        }
        System.out.println("Время года: " + season);
    }

    /**
     * Пример 3: Калькулятор оценок Программа преобразует численную оценку студента в буквенный эквивалент по следующей
     * шкале: - Оценка 90 и выше: 'Отлично' (A). - Оценка от 80 до 89: 'Хорошо' (B). - Оценка от 70 до 79:
     * 'Удовлетворительно' (C). - Оценка ниже 70: 'Неудовлетворительно' (F).
     */
    private static void rateConverter() {
        System.out.println("\nВведите численную оценку студента:");
        int score = scanner.nextInt();
        String grade;
        if (score >= 90) {
            grade = "Отлично (A)";
        } else if (score >= 80) {
            grade = "Хорошо (B)";
        } else if (score >= 70) {
            grade = "Удовлетворительно (C)";
        } else {
            grade = "Неудовлетворительно (F)";
        }
        System.out.println("Буквенный эквивалент оценки: " + grade);
    }
}
