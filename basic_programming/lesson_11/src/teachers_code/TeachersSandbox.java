package teachers_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TeachersSandbox {
    public static void main(String[] args) throws FileNotFoundException {
        int[] nums = new int[0]; // []

        char[] chars = {'h', 'e', 'l', 'o', 110};

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        System.out.println(Arrays.toString(chars));

        Scanner[] scanners = new Scanner[2];

        System.out.println("Arrays.toString(scanners) = " + Arrays.toString(scanners));

        scanners[0] = new Scanner(System.in);
        scanners[1] =  new Scanner(new File("/Users/imiftakhov/Desktop/Java/AIT-TR/cohort39.1/basic_programming/lesson_11/src/teachers_code/TeachersSandbox.java"));

        System.out.println("Arrays.toString(scanners) = " + Arrays.toString(scanners));
    }
}
