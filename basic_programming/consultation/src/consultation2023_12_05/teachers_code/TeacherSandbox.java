package consultation2023_12_05.teachers_code;

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

        // random int in range from 0 to 100
        int x = random.nextInt(101); // 101 - out of the range

        // decision with Math.random() in range from 0 to 100
        int y = (int) Math.random() * 100 + 1;  // 50

        // random int in range from 50 to 100
        x = random.nextInt(50, 101); // 101 - out of the range

        x = random.nextInt(3) - 1; // 0 1 2 -> -1 0 1

        // range from -5 to 0 (exclude 0)
        x = random.nextInt(-5, 0);
        System.out.println("\n" + x);
    }
}
