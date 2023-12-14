package consultation2023_12_14.teachers_code;

import java.util.Random;

public class TeacherSandbox {
    public static void main(String[] args) {

    }


    /**
     * Задача 2: Поиск Самого Длинного Слова в Строке
     * <p>
     * Напишите метод findLongestWord, который принимает строку и возвращает самое длинное слово в этой строке.
     * @param input - исходный текст, который следует разделить по пробелам и найти в нем самую длинную строку
     * @return - возвращает конкретное слово, самое длинное в исходной строке
     */
    public static String longestWord(String input) {
        String longestWord = null;

        // первая проверка на значение null, тк если этого не сделать дальнейшие операции приведут к ошибкам
        if (input == null) {
            return longestWord;
        }

        // разделил строку по пробелам
        String[] words = input.split("\\s+"); // "hello      friends" -> {"hello", "friends"}

        if (words.length == 0) {
            return longestWord;
        }

        longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }
}
