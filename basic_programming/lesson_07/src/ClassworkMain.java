import java.util.Scanner;

public class ClassworkMain {
    public static void main(String[] args) {
//        tryIfElseStatement();
//        ifElseWithString();
//        ternaryOperatorExamples();
//        shopping();
    }

    private static void tryIfElseStatement() {
        boolean condition = false;

        if (condition) {
            System.out.println("Текст из блока  \"if\"");
        } else {
            System.out.println("Текст из блока   \"else\"");
        }
    }

    static void ifElseWithString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String dayOfTheWeek = scanner.nextLine();

        if (dayOfTheWeek.equalsIgnoreCase("Суббота") || dayOfTheWeek.equalsIgnoreCase("Воскресенье")) {
            System.out.println("Сегодня выходной, отдыхайте!");
        } else if (dayOfTheWeek.equalsIgnoreCase("Пятница")) {
            System.out.println("Сегодня пятница - короткий день!");
        } else {
            System.out.println("Сегодня рабочий день, просто сосредоточьтесь на текущих задачах;)");
        }

        scanner.close();
    }

    private static void ternaryOperatorExamples() {
        Scanner scanner = new Scanner(System.in);

        // Пример использования тернарного оператора для определения четности числа
        System.out.println("Введите число для проверки четности:");
        int number = scanner.nextInt();
        String parity = (number % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println("Число " + number + " - " + parity);

        // Пример использования вложенного тернарного оператора для категоризации возраста
        System.out.println("\nВведите ваш возраст:");
        int age = scanner.nextInt();
        String category = (age < 12) ? "Ребенок" :
                (age < 18) ? "Подросток" :
                        (age < 70) ? "Взрослый" : "Пенсионер";
        System.out.println("Ваша категория: " + category);

        scanner.close();
    }

    static void shopping() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Есть ли у вас курица? Введите пожалуйста ответ true/false:");
        boolean haveChicken = scanner.nextBoolean();

        if (haveChicken) {
            System.out.println("я купил курицу");
        }

        System.out.println("Есть ли у вас картофель? Введите пожалуйста ответ true/false:");
        boolean havePotato = scanner.nextBoolean();
        if (havePotato) {
            System.out.println("я купил картошку");
        } else {
            System.out.println("я купил макароны");
        }


        System.out.println("Какие у вас есть сладости? Есть ли у вас конфеты \"коровка\"? " +
                "Введите пожалуйста ответ true/false:");
        boolean haveCandy = scanner.nextBoolean();

        System.out.println("Есть ли у вас пироженные? " +
                "Введите пожалуйста ответ true/false:");
        boolean haveCake = scanner.nextBoolean();

        System.out.println("Есть ли у вас шоколадные печенья? " +
                "Введите пожалуйста ответ true/false:");
        boolean haveCookie = scanner.nextBoolean();

        if (haveCandy) {
            System.out.println("мне на всю сдачу!");
        } else if (haveCake) {
            System.out.println("Есть ли у вас пироженное \"картошка\"? " +
                    "Введите пожалуйста ответ true/false:");
            boolean havePotatoCake = scanner.nextBoolean();
            if (havePotatoCake) {
                System.out.println("дайте три штуки");
            } else {
                System.out.println("дайте тогда заварную трубочку");
            }
        } else if (haveCookie) {
            System.out.println("тогда мне печенье к чаю");
        } else {
            System.out.println("тогда палочку лакрицы");
        }
    }
}
