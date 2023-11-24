public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Примеры префиксной инкрементации и декрементации
        System.out.println("Исходное значение a: " + a);
        int preIncrement = ++a; // a сначала увеличивается, затем присваивается
        System.out.println("После префиксной инкрементации: " + preIncrement + ", a = " + a);

        System.out.println("Исходное значение b: " + b);
        int preDecrement = --b; // b сначала уменьшается, затем присваивается
        System.out.println("После префиксной декрементации: " + preDecrement + ", b = " + b);

        // Сброс переменных a и b
        a = 5;
        b = 5;

        // Примеры постфиксной инкрементации и декрементации
        System.out.println("Исходное значение a: " + a);
        int postIncrement = a++; // a присваивается, затем увеличивается
        System.out.println("После постфиксной инкрементации: " + postIncrement + ", a = " + a);

        System.out.println("Исходное значение b: " + b);
        int postDecrement = b--; // b присваивается, затем уменьшается
        System.out.println("После постфиксной декрементации: " + postDecrement + ", b = " + b);
    }
}
