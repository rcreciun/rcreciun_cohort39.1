package theory;

import java.util.Arrays;

public class Classwork4 {
    public static void main(String[] args) {
        int[] srcArray = {5, 6, 7, 8, 9, 11, -11, 23, 45};
        int[] destArray = new int[5]; // [0, 0, 0, 0, 0]

        int srcPos = 3;
        int destPos = 1;
        int length = 3;

        // srcArray - исходный массив-источник, из этого массива будем брать элементы
        // srcPos - индекс в srcArray от которого начнется копирование элементов
        // destArray - массив в который будем копировать элементы
        // destPos - индекс в destArray с которого начнем копирование
        // length - количество элементов, которое будет скопировано
        System.arraycopy(srcArray, srcPos, destArray, destPos, length);

        System.out.println("Arrays.toString(destArray) = " + Arrays.toString(destArray));
    }
}
