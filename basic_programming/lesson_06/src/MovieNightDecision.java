import java.util.Scanner;

public class MovieNightDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача: Определить, устраивает ли группа друзей киноночь.
        // Группа устраивает киноночь, если:
        // - не менее 4 и не более 8 человек собираются вместе,
        // - все согласны смотреть один и тот же фильм,
        // - текущий день является выходным.

        // Спросить количество друзей
        System.out.println("Сколько друзей собираются вместе?");
        int friendsCount = scanner.nextInt();

        // Спросить о согласии на фильм
        System.out.println("Все ли согласны смотреть один и тот же фильм? (true/false):");
        boolean isAgreeOnMovie = scanner.nextBoolean();

        // Спросить, является ли сегодня выходным
        System.out.println("Сегодня выходной? (true/false):");
        boolean isWeekend = scanner.nextBoolean();

        // Логическое условие для киноночи
        boolean canHaveMovieNight = false;

        // Вывод результата
        System.out.println("Может ли группа друзей устроить киноночь? " + canHaveMovieNight);
    }
}
