package teachers_code;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TeacherSandbox {
    public static void main(String[] args) {
        int[] nums = {45, 6, 78, -12, 0, 1};

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("nums = " + nums);

        Arrays.sort(nums);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("nums = " + nums);

        String str = "hello";
        str = str.toUpperCase();

        int x = 10;
        char s = 'd';

        Scanner scanner = new Scanner(System.in);
    }
}
