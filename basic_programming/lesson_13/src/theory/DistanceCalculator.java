package theory;

public class DistanceCalculator {

    public static void main(String[] args) {
        double[] point1 = {1.0, 2.0, 3.0};
        double[] point2 = {4.0, 5.0, 6.0};

        calculateDistance(point1, point2);
    }

    // Метод для вычисления расстояния между двумя точками в 3D пространстве
    public static void calculateDistance(double[] point1, double[] point2) {
        if (point1.length != 3 || point2.length != 3) {
            System.err.println("Каждая точка должна иметь три координаты.");
            // остановка работы метода
            return;
        }

        double distance =  Math.sqrt(Math.pow(point2[0] - point1[0], 2) +
                Math.pow(point2[1] - point1[1], 2) +
                Math.pow(point2[2] - point1[2], 2));

        System.out.println("Расстояние между точками: " + distance);
    }
}


