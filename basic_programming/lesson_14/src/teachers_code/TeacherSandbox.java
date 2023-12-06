package teachers_code;

import java.util.Arrays;
import java.util.Scanner;

public class TeacherSandbox {
    // задача: создать массив, считав значения из консоли, при этом не зная исходны размер
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int[] nums = new int[0];

        System.out.println("Вы хотите ввести все элементы в массив за раз через пробел или вводить элементы по одному?\n" +
                "1 - все за раз\n" +
                "2 - по одному");

        String userAnswer = scanner.nextLine();

        while (!(userAnswer.equals("1") || userAnswer.equals("2"))) {
            System.out.println("Некорректный ответ! Пожалуйста введите ваш ответ повторно 1 или 2:");
            userAnswer = scanner.nextLine();
        }

        // в этом случае все элементы массива будут введены в одной строке, разделенной пробелами "1 2 3 4"
        if (userAnswer.equals("1")) {
            System.out.println("Вы выбрали ввести все значения в одну строку. " +
                    "Пожалуйста введите ниже последовательность целых чисел, " +
                    "разделяя отдельные элементы массива пробелами");
            String input = scanner.nextLine(); // "1 2 3 4"

            // "\\s+" - регулярное выражение для пробелов, относится к типу данных String
            String[] arrayStringInput = input.split("\\s+"); // {"1", "2", "3", "4"}

            // тк изначально мы не знали сколько элементов будет в конечном массиве,
            // nums был проинициализирован длинной 0, теперь же мы точно знаем сколько элементов будет в конечном
            // массиве (arrayStringInput.length) и перееопределяем nums
            nums = new int[arrayStringInput.length];

            for (int i = 0; i < nums.length; i++) {
                // Integer.parseInt(arrayStringInput[i]) - приводит i-й элемент массива arrayStringInput из типа
                // String к типу int
                nums[i] = Integer.parseInt(arrayStringInput[i]);
            }
        } else {
            // scanner.hasNextInt() - метод, который возвращает true. если в консоли есть еще число, false - если нет.
            // таким образом наш цикл будет работать до тех пор, пока в консоли будет ввод в виде целых чисел и сразу
            // остановится, как только ввод целых чисел прекратиться
            while (scanner.hasNextInt()) {
                // тк мне необходимо добавлять элементы и я не знаю сколько именно элементов мне надо добавить, но при
                // этом я знаю, что ввод идет лишь по одному элементу за раз, то я просто буду пересоздавать массив
                // nums, добавляя в конце пустую ячейку
                // было [1, 2] стало [1, 2, 0], 0 - значение по умолчанию, которым автоматически заполнилась новая ячейка
                nums = Arrays.copyOf(nums, nums.length + 1);

                // тк при помощи scanner.hasNextInt() мы точно знаем, что нам в консоль вводят исключительно целые
                // числа, можно сразу же сохранять их в массив, избегая операции Integer.parseInt
                // тк мы специально выделили ячейку для нового числа, мы сразу сохраним его в эту ячейку - в последнюю ячейку
                nums[nums.length - 1] = scanner.nextInt();
            }
        }

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
