package teachers_code;


import mail_service.teachers_code.MailService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TeacherSandbox {
    public static void main(String[] args)  {

    }

    public static int[] addNumber(int[] nums, int num) {
        int[] arr = Arrays.copyOf(nums, nums.length + 1);

        arr[arr.length - 1] = num;

        return arr;
    }
}
