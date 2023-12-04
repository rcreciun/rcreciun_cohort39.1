package teachers_code;

import java.util.Arrays;

public class TeacherSandbox {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, -8, -5, -8};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int secondMin = nums[1];
        System.out.println("Второй минимальный элемент в массиве равен = " + secondMin);

        // найти в массиве второй минимальный элемент с учетом того, что значение должно отличаться от минимума и
        // последоватльность в исходном массиве менять нельзя. Запрещается также пользоваться классом Arrays
        // (исключение Arrays.toString())



    }
}
