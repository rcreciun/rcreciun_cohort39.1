import java.util.Arrays;

public class Classwork2 {
    public static void main(String[] args) {


        String[] names = new String[3]; // [null, null ... null]
        String[] names2 = new String[names.length];

        names[0] = "Ilyas Miftakhov";
        names[1] = "Andrey";
        names[2] = "Andrey Kavaev";

        //...
        System.out.println("names.length = " + names.length);
        System.out.println("names[names.length - 1] = " + names[names.length - 1]);

        for (int i = 0; i < names.length; i++) {
            names2[i] = names[i];
        }

        for (int i = 0; i < names2.length; i++) {
            System.out.printf("names2[%d] = %s\n", i,  names2[i]);
            System.out.printf("names[%d] = %s\n", i,  names[i]);
        }

        System.out.println("names == names2 = " + (names == names2));
        System.out.println("names.equals(names2) = " + names.equals(names2));

        boolean isArraysEquals = true;

        if (names.length != names2.length) {
            isArraysEquals = false;
        }

        if (isArraysEquals) {
            for (int i = 0; i < names.length; i++) {
               if (!names[i].equals(names2[i])) {
                   isArraysEquals = false;
                   break;
               }
            }
        }

        System.out.println("names equals names2 = " + isArraysEquals);


        // Arrays.equals(arr1[], arr2[]); - позволет поэлементно сравнить два массива.
        // true - если все эелементы равны;
        // false - ксли отличаются
        isArraysEquals = Arrays.equals(names, names2);
        System.out.println("isArraysEquals = " + isArraysEquals);

        String temp = names2[2];
        names2[2] = names2[1];
        names2[1] = temp;

        System.out.println("После того, как поменял местами значения в ячейках Arrays.equals(names, names2) = "
                + Arrays.equals(names, names2));

        // Arrays.copyOf(originalArray[], lengthOfNewArray); - создаст новый массив, длинной lengthOfNewArray,
        // взяв за основу элементы из originalArray[]. Если  lengthOfNewArray больше чем количество элементов в
        // originalArray, то не хватающие значения будут заполнены значениями по умолчанию для того типа данных,
        // который использует данный массив, если наоборот - lengthOfNewArray меньше количества элементов в
        // originalArray, то будут взяты только первые элементы для формирования нового массива.
        // данная операция позволяет избежать ошибок, связанных с простым копированием (newArray = oldArray)
        String[] names3 = Arrays.copyOf(names2, names2.length);

        // Arrays.toString(arr[]) - создаст строку со всеми элементами массива
        System.out.println("Arrays.toString(names3) = " + Arrays.toString(names3));

    }
}
