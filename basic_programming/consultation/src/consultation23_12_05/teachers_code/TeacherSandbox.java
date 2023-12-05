package consultation23_12_05.teachers_code;

import java.util.Random;

public class TeacherSandbox {
    public static void main(String[] args) {
        Random random = new Random();

        // int Integer.MIN_VALUE to Integer.MAX_VALUE
        random.nextInt();

        for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt() + " ");
        }
        System.out.println();

        // double 0.0 to 1.0 (exclude 1.0)
        Math.random();
        for (int i = 0; i < 100; i++) {
            System.out.printf("%.4f ", Math.random());
        }
    }
}
