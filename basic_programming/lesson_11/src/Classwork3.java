import java.util.Arrays;
import java.util.Random;

public class Classwork3 {
    public static void main(String[] args) {
        double[] floatNums = new double[10];

        String stringVisionOfFloatNums = Arrays.toString(floatNums);
        System.out.println("stringVisionOfFloatNums = " + stringVisionOfFloatNums);

        for(int i = 0; i < floatNums.length; i++) {
            Random random = new Random();
            floatNums[i] = random.nextInt(0, 50);
        }

        stringVisionOfFloatNums = Arrays.toString(floatNums);
        System.out.println("stringVisionOfFloatNums = " + stringVisionOfFloatNums);

        double[] copyOfFloatNums = Arrays.copyOf(floatNums, 8);
        String stringVisionOfCopyOfFloatNums = Arrays.toString(copyOfFloatNums);

        System.out.println("stringVisionOfCopyOfFloatNums = " + stringVisionOfCopyOfFloatNums);
    }
}
