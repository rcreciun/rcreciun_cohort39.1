package consultation23_12_05.teachers_code;

public class TeacherSandbox2 {
    public static void main(String[] args) {
        double[] circle = {3};
        double[] rectangle = {3, 4};
        double[] triangle = {3, 4, 5};
        double[] incorrect = {3, 4, 5, 6};
        double[] empty = {};

        calculateArea(circle);
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
}
