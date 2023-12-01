package teachers_code;

import java.util.Arrays;

public class TeachersSandbox2 {
    public static void main(String[] args) {
        int[] transactions = {100, 200, 300};

        // for-each
        for (int transaction : transactions) {
            transaction = transaction / 10;
            System.out.println(transaction);
        }
        System.out.println("Arrays.toString(transactions) = " + Arrays.toString(transactions));



        for (int i = 0; i < transactions.length; i++) {
            transactions[i] = transactions[i] / 10;
        }
        System.out.println("Arrays.toString(transactions) = " + Arrays.toString(transactions));

    }
}
