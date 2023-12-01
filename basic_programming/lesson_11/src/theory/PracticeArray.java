package theory;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *  Формирование Максимального Числа из Строки
 *
 *  Задачи:
 * Программа Преобразования Строки в Максимальное Число:
 * Напишите программу, которая принимает число в виде строки.
 * Программа должна выводить максимально возможное число, которое можно составить из цифр входной строки.
 * Если входная строка уже представляет собой максимальное число, программа должна вывести -1.
 * Примеры Ввода и Вывода:
 * Ввод: "123" -> Вывод: 321
 * Ввод: "921" -> Вывод: -1
 * Ввод: "912" -> Вывод: 921
 *
 * Детали Реализации:
 * 1. Конвертация Строки в Массив:
 *   - Преобразуйте входную строку в массив цифр.
 * 2. Обработка и Сортировка:
 *   - Отсортируйте массив цифр в убывающем порядке.
 * 3. Формирование Результата:
 *   - Сформируйте число из отсортированных цифр и сравните его с исходной строкой.
 *   - Если число совпадает с исходной строкой, верните -1.
 *   - В противном случае, верните сформированное число.
 * 4. Вывод Результата:
 *   - Программа должна выводить результат в консоль.
 */


public class PracticeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше число");
        String input = scanner.nextLine();

        while (!input.matches("\\d+")) {
            System.out.println("Ваша строка содержит символы помимо чисел, попробуйте еще раз");
            input = scanner.nextLine();
        }

        // получаем массив из строк, каждая строка содержит лишь один символ "123" -> ["1", "2", "3"]
        String[] digits = input.split(""); // "31213".split("1") -> ["3", "2", "3"]

        // хранит числа, которые соответсвуют числам в digits
        int[] nums = new int[0]; // какой длинны должен быть массив?

        for (int i = 0; i < nums.length; i++) {
            // реализуйте логику, которая будет брать элемент из digits, конвертировать в int и перекладывать в nums.
            // Используйте для этого Integer.parseInt("23234") -> 23234 (int)

            // String digit = digits[i];
            //int num = Integer.parseInt(digit); -> Integer.parseInt(digits[i]);

            //nums[i] = num; ->
            nums[i] = Integer.parseInt(digits[i]);
        }

        // сортировка
        Arrays.sort(nums);
        // сортировака nums Arrays.sort()
        // формирования максимального числа (можно сделать путем добавления в StringBuilder и потом перевода в число)
        // от последнего элемента в nums к первому, добавляя каждый элемент в StringBuilder, либо банально прибавляя к
        // String result = "";

        StringBuilder result = new StringBuilder();
        for (int i = nums.length - 1;  i >= 0; i--) {
            result.append(nums[i]);
        }

        // String strResult = result.toString();

        if(input.equals(result.toString())) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

        // альтернативное решение:
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        //String alternativeStr = new String(chars);
        // StringBuilder alternative = new StringBuilder(alternativeStr);
        //StringBuilder alternative = new StringBuilder(new String(chars));
        StringBuilder alternative = new StringBuilder(new String(chars)).reverse();
        // alternative = alternative;

        if (input.equals(alternative.toString())) {
            System.out.println(-1);
        } else {
            System.out.println(alternative);
        }
    }
}
