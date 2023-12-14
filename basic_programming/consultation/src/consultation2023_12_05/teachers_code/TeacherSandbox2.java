package consultation2023_12_05.teachers_code;

import java.util.Random;

public class TeacherSandbox2 {
    public static void main(String[] args) {
        double[] circle = {3};
        double[] rectangle = {3, 4};
        double[] triangle = {3, 4, 5};
        double[] incorrect = {3, 4, 5, 6};
        double[] empty = {};

        new Random().nextInt();

        //calculateArea(circle);

        formattingOutputQuestion();
    }

    public static void calculateArea(double[] sizes) {
        if (sizes.length == 1) {
            // вызываем метод для подсчета площади круга
        } else if (sizes.length == 2) {
            // вызываем метод для подсчета площади прямоугольника
        } else if (sizes.length == 3) {
            // вызываем метод для подсчета площади треугольника
        } else {
            System.err.println("Incorrect input");
        }
    }

    public static void calculateArea(double radius) {

    }

    // попробуйте решить задачу перегрузив методы
    public static void calculateCircleArea(){
        //...
        // печатает результат
    }

    public static void publicGreeting() {
        System.out.println("hello for everyone");
    }

    static void defaultGreeting() {
        System.out.println("hello");
    }

    public static void testQuestion() {
        //1 % 2 == 1
        //это true ?

        //1/2 = 0,5
        //это становится единицей?

        int x = 1;
        int y = 2;

        System.out.println("x % y = " + x % y);
    }

    public static void formattingOutputQuestion() {
        double x = 1.0 / 3;

        System.out.println(x);

        // при форматированном выводе данные конструкции равны:
        System.out.printf("x = %f%s\n", x, "%");
        System.out.printf("x = %f%%%n", x);

        System.out.printf("x = %.2f%%\n", x);
        // %n - нова строка
        // %% - чтобы распечатать символ % в консоль,
        // тк использование 1 символа % в строке в форматированном выводе приведет к ошибке
        System.out.printf("x = %.2f%%%n", x);
    }
}
