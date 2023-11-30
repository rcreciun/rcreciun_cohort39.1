import java.util.Scanner;

public class Consultation {
    public static void main(String[] args) {
        // 2 .. n 2323
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста верзний предел диапозона поиска простых чисел:");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("введенное число некорректно");
        }else if (n == 2) {
            System.out.println(2 + " - простое число");
        } else {
            for (int i = 2; i <= n ; i++ ) { // n = 100
                // 17  ->  2 3 4 5 6         11

                //  217 -> 2                    109


                boolean isPrime = true;
                // proof that its incorrect

                // цикл for для проверки, что число без остатка делиться только на себя и на 1
                for (int j = 2; j < i / 2; j++) {
                    // если число i без остатка делиться на j, значит это не простое число
                }

                // if-else если isPrime все еще равен true, то это число - простое,
                // если false - составное (об этом информацию выводить не надо)
            }

        }




    }
}
