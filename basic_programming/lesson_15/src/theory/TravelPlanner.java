package theory;

import java.util.Scanner;

public class TravelPlanner {

    private static final int MAX_DESTINATIONS = 10;
    private static String[] destinations = new String[MAX_DESTINATIONS];
    private static double[] costs = new double[MAX_DESTINATIONS];
    private static int[] durations = new int[MAX_DESTINATIONS];
    private static int destinationCount = 0;

    /**
     * Главный метод для запуска приложения.
     * @param args Аргументы командной строки, не используются в этом приложении.
     */
    public static void main(String[] args) {
        start();
    }


    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Введите название места назначения (или 'exit' для завершения): ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("exit") && destinationCount < MAX_DESTINATIONS) {
                System.out.println("Введите стоимость поездки: ");
                double cost = scanner.nextDouble();

                System.out.println("Введите продолжительность поездки в днях: ");
                int duration = scanner.nextInt();

                addDestination(input, cost, duration);
                scanner.nextLine(); // Очистить буфер сканера
            }
        } while (!input.equalsIgnoreCase("exit") && destinationCount < MAX_DESTINATIONS);

        printTravelPlan();
    }

    /**
     * Добавляет новое место назначения в план путешествия.
     * @param destination Название места назначения.
     * @param cost Стоимость поездки.
     * @param duration Продолжительность поездки в днях.
     */
    public static void addDestination(String destination, double cost, int duration) {
        destinations[destinationCount] = destination;
        costs[destinationCount] = cost;
        durations[destinationCount] = duration;
        destinationCount++;
    }

    /**
     * Вычисляет и возвращает общую стоимость путешествия.
     * @return Общая стоимость путешествия.
     */
    public static double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < destinationCount; i++) {
            totalCost += costs[i];
        }
        return totalCost;
    }

    /**
     * Вычисляет и возвращает общую продолжительность путешествия в днях.
     * @return Общая продолжительность путешествия.
     */
    public static int calculateTotalDuration() {
        int totalDuration = 0;
        for (int i = 0; i < destinationCount; i++) {
            totalDuration += durations[i];
        }
        return totalDuration;
    }

    /**
     * Выводит итоговый план путешествия, включая места назначения, стоимость и продолжительность каждого этапа,
     * а также общую стоимость и продолжительность путешествия.
     */
    public static void printTravelPlan() {
        System.out.println("Итоговый План Путешествия:");
        for (int i = 0; i < destinationCount; i++) {
            System.out.println((i + 1) + ". " + destinations[i] + " - " + costs[i] + " eur., " + durations[i] + " дней");
        }
        System.out.println("Общая стоимость: " + calculateTotalCost() + " eur.");
        System.out.println("Общая продолжительность: " + calculateTotalDuration() + " дней");
    }
}

