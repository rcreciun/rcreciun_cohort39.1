import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // изначальная сумма покупок в корзине
        int amount = 0;

        do {
            System.out.println("Введите стоимость отдельного товара (целое число) или -1, если вы закончили");
            // операция Integer.parseInt("123") - преобразует строку к числу, в данном примере к числу 123.
            // Обязательно должен быть корректны вид исходной строки, те "12к", "12 34" или "12,23" - приведет к ошибке
            int price = Integer.parseInt(scanner.nextLine());

            System.out.println("Желаете ли вы положить товар в корзину? yes/no");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Хорошо, сумма данного товара не прибавленна к общей корзине");
                continue;
            }

            if (price == -1) {
                break;
            }

            amount += price;
        } while(true);

        System.out.println("Стоимость всех вещей в вашей корзине равняется " + amount);
    }
}
