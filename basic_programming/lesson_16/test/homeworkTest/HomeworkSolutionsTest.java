package homeworkTest;

import homework.HomeworkSolution14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkSolutionsTest {

    // Тест для проверки существования треугольника
    @Test
    public void testCanTriangleExist() {
        assertTrue(HomeworkSolution14.canTriangleExist(3, 4, 5), "Треугольник с сторонами 3, 4, 5 должен существовать");
        assertFalse(HomeworkSolution14.canTriangleExist(1, 2, 3), "Треугольник с сторонами 1, 2, 3 не должен существовать");
    }

    // Тест для проверки объединения строк с изменением регистра
    @Test
    public void testMergeStrings() {
        assertEquals("aaBBB", HomeworkSolution14.mergeStrings("aaaa", "bbbbbb"), "Объединение 'aaaa' и 'bbbbbb' должно дать 'aabBBB'");
    }

    // Тест для проверки вычисления среднего арифметического
    @Test
    public void testCalculateAverage() {
        assertEquals(3.0, HomeworkSolution14.calculateAverage(new int[]{1, 2, 3, 4, 5}), 0.001, "Среднее арифметическое 1, 2, 3, 4, 5 должно быть 3.0");
        assertEquals(20.0, HomeworkSolution14.calculateAverage(new int[]{10, 20, 30}), 0.001, "Среднее арифметическое 10, 20, 30 должно быть 20.0");
    }

    // Тест для проверки определения четности суммы чисел
    @Test
    public void testIsSumEven() {
        assertTrue(HomeworkSolution14.isSumEven(2, 4), "Сумма 2 и 4 должна быть четной");
        assertFalse(HomeworkSolution14.isSumEven(3, 4), "Сумма 3 и 4 должна быть нечетной");
    }

    // Тест для проверки преобразования секунд в часы, минуты и секунды
    @Test
    public void testConvertSeconds() {
        assertEquals("01:01:01", HomeworkSolution14.convertSeconds(3661), "3661 секунда должна быть преобразована в '01:01:01'");
        assertEquals("23:59:59", HomeworkSolution14.convertSeconds(86399), "86399 секунд должны быть преобразованы в '23:59:59'");
    }

    @Test
    public void testCalculateArea() {
        // В каждом из методов указана допустимая погрешность - delta 0.001
        // Тестирование площади круга
        assertEquals(Math.PI, HomeworkSolution14.calculateArea(1), 0.001, "Площадь круга с радиусом 1 должна быть Pi");

        // Тестирование площади прямоугольника
        assertEquals(12.0, HomeworkSolution14.calculateArea(3, 4), 0.001, "Площадь прямоугольника со сторонами 3 и 4 должна быть 12");

        // Тестирование площади треугольника
        assertEquals(6.0, HomeworkSolution14.calculateArea(3, 4, 5), 0.001, "Площадь треугольника со сторонами 3, 4, 5 должна быть 6");

        // Тестирование некорректного ввода
        assertEquals(-1, HomeworkSolution14.calculateArea(1, 2, 3, 4), 0.001, "Для некорректного количества размеров должно возвращаться -1");
    }
}

