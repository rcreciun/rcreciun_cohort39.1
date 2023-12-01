package theory;

public class Classwork {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 4;
        int d = 7;
        // .. 100500
        int n = 7;

        int[] nums1 = new int[10]; // [0, 0, 0, 0, 0]
        // метод length - позволяет узнать длинну массива (количество ячеек в данном массиве,
        // даже если эти ячейки еще пусты)
        System.out.println("nums1.length = " + nums1.length);

        int[] nums2 =  {5, 3, 4, 7, 7};

        nums1[0] = 5; // [5, 0, 0, 0, 0]
        nums1[3] = 7; // [5, 0, 0, 7, 0]
        nums1[1] = 8; // [5, 8, 0, 7, 0]
        nums1[1] = 3; // [5, 3, 0, 7, 0]
        nums1[2] = 4; // [5, 3, 4, 7, 0]
        nums1[nums1.length - 1] = 7; // [5, 3, 4, 7, 7]

        int p = nums2[0] + nums2[1] + nums2[2] + nums2[3] + nums2[4];

        System.out.println(p);
        System.out.printf("%d, %d, %d, %d, %d\n",  nums2[0],  nums2[1], nums2[2], nums2[3], nums2[4]);

        // nums1[-81], также как и nums1[81] приведет к ошибке, так как мы пытаемся таким образом
        // получить доступ к ячейке, которой не существует

        for (int i = 0; i < nums1.length ; i++) {

            System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
        }


    }
}
