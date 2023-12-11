package homeworkTest;

import homework.HomeworkSolution14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkSolutionsTest {
    @Test
    public void testFindMax() {
        // Тестирует метод findMax, проверяя, правильно ли он определяет максимальное число из трех.
        assertEquals(9, HomeworkSolution14.findMax(3, 9, 7),
                "findMax не корректно находит максимум среди положительных чисел");
        assertEquals(-1, HomeworkSolution14.findMax(-1, -3, -2),
                "findMax не корректно находит максимум среди отрицательных чисел");
    }

    @Test
    public void testFindLongestWord() {
        // Тестирует метод findLongestWord, проверяя, правильно ли он находит самое длинное слово в строке.
        assertEquals("longest", HomeworkSolution14.findLongestWord("This is the longest word"),
                "findLongestWord не корректно находит самое длинное слово");
        assertEquals("word", HomeworkSolution14.findLongestWord("word"),
                "findLongestWord не корректно работает со строкой из одного слова");
    }

    @Test
    public void testCalculateBMI() {
        // Тестирует метод calculateBMI, проверяя правильность расчета индекса массы тела.
        assertEquals(22.85, HomeworkSolution14.calculateBMI(70, 1.75), 0.01,
                "calculateBMI не корректно рассчитывает ИМТ");
        assertEquals(18.36, HomeworkSolution14.calculateBMI(50, 1.65), 0.01,
                "calculateBMI не корректно рассчитывает ИМТ при других параметрах");

    }

    @Test
    public void testConvertSecondsToFormattedTime() {
        // Тестирует метод convertSecondsToFormattedTime, проверяя правильность конвертации секунд в форматированное время.
        assertEquals("01:40:40", HomeworkSolution14.convertSecondsToFormattedTime(6040),
                "convertSecondsToFormattedTime не корректно конвертирует время");
        assertEquals("00:00:00", HomeworkSolution14.convertSecondsToFormattedTime(0),
                "convertSecondsToFormattedTime не корректно работает с нулевым значением");
    }

    @Test
    public void testCalculateArea() {
        // Тестирует метод calculateArea, проверяя правильность вычисления площади для разных фигур.
        assertEquals(Math.PI * 4 * 4, HomeworkSolution14.calculateArea(new double[]{4}), 0.01,
                "calculateArea не корректно вычисляет площадь круга");
        assertEquals(20.0, HomeworkSolution14.calculateArea(new double[]{4, 5}), 0.01,
                "calculateArea не корректно вычисляет площадь прямоугольника");
        assertEquals(6.0, HomeworkSolution14.calculateArea(new double[]{3, 4, 5}), 0.01,
                "calculateArea не корректно вычисляет площадь треугольника");
        assertEquals(-1, HomeworkSolution14.calculateArea(new double[]{}), 0.01,
                "calculateArea не корректно обрабатывает некорректные данные");
    }
}

