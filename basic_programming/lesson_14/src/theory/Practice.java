package theory;

public class Practice {
    // разделите логически код в мтеоде main по отдельным методам. Определите переменные, которые меняются
    // (которые должны приходить в качестве аргументов) и результирующие ( какие переменные выступают в качестве
    // результата операций)
    public static void main(String[] args) {
        // Вычисление факториала числа number
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + number + " равен " + factorial);

        // Проверка числа number2 на простоту
        int number2 = 7;
        boolean isPrime = true;

        if (number2 <= 1) {
            isPrime  = false;
        }
        for (int i = 2; i <= Math.sqrt(number2); i++) {
            if (number2 % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number2 + " является простым числом: " + isPrime);

        // Подсчет количества гласных в строке str
        String str = "Привет";

        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'а' || ch == 'е' || ch == 'и' || ch == 'о' || ch == 'у' || ch == 'ы' || ch == 'э' || ch == 'ю' || ch == 'я') {
                count++;
            }
        }
        System.out.println("Количество гласных в строке \"" + str + "\": " + count);

        // Вычисление суммы цифр числа number3
        int number3 = 12345;
        int sum = 0;
        while (number3 > 0) {
            sum += number3 % 10;
            number3 /= 10;
        }
        System.out.println("Сумма цифр числа " + number3 + " равна " + sum);
    }
}
