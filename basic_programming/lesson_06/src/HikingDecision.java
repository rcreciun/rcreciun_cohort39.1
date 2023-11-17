import java.util.Scanner;

public class HikingDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача: Определить, пойдет ли группа в поход.
        // Группа идет в поход, если:
        // - размер группы больше 3 и меньше 10,
        // - температура больше 18 и меньше 25 градусов,
        // - нет осадков.

        // Спросить размер группы
        System.out.println("Введите размер группы:");
        int groupSize = scanner.nextInt();

        // Спросить температуру
        System.out.println("Введите температуру в градусах:");
        int temperature = scanner.nextInt();

        // Спросить о возможности осадков
        System.out.println("Ожидаются ли осадки? (true/false):");
        boolean isRaining = scanner.nextBoolean();

        // Логическое условие для похода
        boolean canGoHiking = (groupSize > 3 && groupSize < 10) && (temperature > 18 && temperature < 25) && !isRaining;

        // Вывод результата
        System.out.println("Может ли группа идти в поход? " + canGoHiking);
    }
}
