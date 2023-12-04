import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста верхний предел диапозона поиска простых чисел:");
        int n = scanner.nextInt();


        if (n < 2) {
            System.out.println("введенное число некорректно");
        } else if (n == 2) {
            System.out.println(2 + " - простое число");
        } else {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                // цикл for для проверки, что число без остатка делиться только на себя и на 1
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                        // если число i без остатка делиться на j, значит это не простое число
                    }
                }
                if (isPrime) {
                    System.out.println(i + " -простое число");
                }
            }
        }
    }
}
