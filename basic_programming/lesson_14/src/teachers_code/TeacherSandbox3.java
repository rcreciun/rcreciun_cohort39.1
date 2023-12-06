package teachers_code;

import java.util.Arrays;
import java.util.Random;

public class TeacherSandbox3 {

    public static void main(String[] args) {
        cleaner();
        String str = baker();

        // сложная логика использования переменной str

        System.out.println("str = " + str);

        int[] nums = createRandomIntArray();

        System.out.println(Arrays.toString(nums));

    }

    // аналогия с кафе, где cleaner - уборщик
    public static void cleaner() {
        System.out.println("я приберу во всем кафе");
    }

    // метод перегружен, так что уборщик работает с разными входными данными
    public static void cleaner(String place) {
        System.out.println("Я приберусь в " + place);
    }

    // метод, возвращающий что-то, это наш "пекарь", как только его вызовем, он принесет нам некий результат - String
    public static String baker() {
        String bakery = "пироженное";

        return bakery;
    }

    // метод тоже перегружен и работает различно в зависимости от взодных данных, например, если указать значение,
    // то "пекарь" вернет уже другой результат
    public static String baker(int count) {
        String bakery = "Я испек " + count + " пирогов";

        return bakery;
    }


    public static int[] createRandomIntArray() {
        int length = new Random().nextInt(100);
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = new Random().nextInt(100);
        }

        return randomArray;
    }
}
