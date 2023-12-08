import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import theory.DistanceCalculator;

class DistanceCalculatorTest {

    @Test
    public void testCalculateDistanceWithReturn() {
        double[] point1 = {0, 0, 0};
        double[] point2 = {1, 0, 0};

        //переменная, в которой мы пишем ожидаемый
        // результат выполнения кода
        double expected = 1.0;

        double result = DistanceCalculator.calculateDistanceWithReturn(point1, point2);

        Assertions.assertEquals(expected, result);
    }


}
