import java.util.Scanner;

public class BooleanExamples {
    static final Scanner SCANNER = new Scanner(System.in);
    static final boolean b1 = true;
    static final boolean b2 = true;
    static final boolean b3 = false;
    static final boolean b4 = false;
    static final int x = 4;
    static final int y = 5;
    static final int z = -5;

    public static void main(String[] args) {
        /**
         *  могут возвращать только true или false (правда или ложь),
         *  мы не можем получить какие-то другие или промежуточные логические значения.
         *  ! -   унарные операторы (не требуют двух значений boolean для операции)
         *
         *  == - логическое равно, можно, означает "равно ли?"
         *  != - логическое "не равно"
         *
         *  > - логическое больше
         *  < - логическое меньше
         *  >= - логическое больше или равно
         *  <= - логическое меньше или равно
         *
         *  ! - логическое отрицание
         *      бинарный оператор (требуют двух значений boolean для операции)
         *
         *  && - логическое "и"  - возвращает true, если ОБА оператора равны true
         *  || - логическое или - возвращает true, если хотя бы один из операторов равен true
         *
         *  ^ - XOR - возвращает true, если логические операторы имеют разное значение
         *
         */

        // logicalEquality();
        // logicalNegation();
        // logicalComparison();
        //logicalBinaryOperation();
        //logicalPriority();
    }

    static void logicalEquality() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        // x = 4    y = 5   z = -5
        String stringTrue = "true"; // [@link1
        String stringFalse = "false"; // [@link2

        System.out.println("true == true = " + (b1 == b2)); // true
        System.out.println("true == false = " + (b1 == b3)); // false
        System.out.println("false == false = " + (b3 == b4)); // true
        System.out.println("x (4) == y (5) = " + (x == y)); // false
        System.out.println("x (4) == 4 = " + (x == 4)); // true

        System.out.println("stringFalse == \"false\" = " + (stringFalse == "false")); // true   //
        System.out.println("stringTrue == stringFalse = " + (stringTrue == stringFalse)); // false
        System.out.println("stringTrue.equals(stringFalse) = " + stringTrue.equals(stringFalse)); // false
//        System.out.println(stringFalse == b1);
    }

    static void logicalNegation() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        // x = 4    y = 5   z = -5
        System.out.println("x != 4 = " + (x != 4)); // false
        System.out.println("x != 5 = " + (x != 5)); // true

        System.out.println("!(x == 4)" + (!(x == 4))); // false
        System.out.println("!(x == 5)" + (!(x == 5))); // true

        System.out.println(!b1); // false
        System.out.println(!b3); // true
    }

    static void logicalComparison() {
        // x = 4    y = 5   z = -5
        System.out.println("x > y = " + (x > y)); // false
        System.out.println("x > 4 = " + (x > 4)); // false
        System.out.println("x < 4 = " + (x < 4)); // false
        System.out.println("y >= z = " + (y >= z)); // true
        System.out.println("y <= z = " + (y <= z)); // false
        System.out.println("z <= -5 = " + (z <= -5));// true
        System.out.println("\'a\' > \'A\' = " + ('a' > 'A'));
        // System.out.println(b1 > b2);
    }

    static void logicalBinaryOperation() {
        // b1 = true     b2 = true      b3 = false      b4 = false
        boolean isCupFull = true;
        boolean isBottleFull = false;

        System.out.println(isCupFull && isBottleFull); // false
        System.out.println("true && true = " + (b1 && b2)); // true
        System.out.println("true && false = " + (b1 && b3)); // false
        System.out.println("false && false = " + (b3 && b4)); // false

        System.out.println("isCupFull || isBottleFull = " + (isCupFull || isBottleFull));
        System.out.println("true || true = " + (b1 || b2)); // true
        System.out.println("true || false = " + (b1 || b3)); // true
        System.out.println("false || false = " + (b3 || b4)); // false

        // XOR - отрицающее или
        System.out.println("isCupFull ^ isBottleFull = " + (isCupFull ^ isBottleFull));
        System.out.println("true ^ true = " + (b1 ^ b2)); // false
        System.out.println("true ^ false = " + (b1 ^ b3)); // true
        System.out.println("false ^ true = " + (b3 ^ b2)); // true
        System.out.println("false ^ false = " + (b4 ^ b4)); // false
    }

    static void logicalPriority() {
        /**
         * приоритет логических операций по убыванию:
         * Сначала выполняются унарные операторы, такие как логическое отрицание (!).
         * Затем идут операторы сравнения: ==, !=, >, <, >=, <=.
         * После этого - логические операторы "И" (&&) и "ИЛИ" (||).
         * Оператор "И" (&&) имеет более высокий приоритет, чем "ИЛИ" (||).
         * Наконец, выполняется логическое исключающее ИЛИ (XOR) (^).
         */

        System.out.println((true && (false || false) ^ !(4 > x)));
        System.out.println(true || true ^ (!false ^ true) || false && !(false && true));


        // true && false ^ !false
        // true && false ^ true
        // false && true
        // true


    }

    static boolean isSomething(boolean b1, boolean b2) {
        boolean result = b1 && b2;

        return result;
    }
}
