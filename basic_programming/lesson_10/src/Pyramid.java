import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту пирамиды: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            if (i == 0) {
                for (int j = 0; j < height - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("/\\");
            }
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i * 2; k++) {
                if (k == 0 || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
