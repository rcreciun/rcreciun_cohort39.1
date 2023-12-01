package theory;

import java.util.Scanner;

public class Task3 {
    // При помощи сканнера считать число - размер массива,
    // после этого запустить цикл и при помощи сканнера заполнить массив числами
    // проверить, есть ли в массиве повторяющиеся числа, ответ сообщить в консоль

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size please:");
        int size = scanner.nextInt();

        int[] nums = new int[0]; //  set necessary variable

        //  create a loop to fill an array (num of iteration?)


        boolean hasPair = false;
        // start loop to check pair of numbers (use nested loop)



        if (hasPair) {
            System.out.println("Array has more than one same number");
        } else {
            System.out.println("All numbers in array are unique");
        }
    }
}
