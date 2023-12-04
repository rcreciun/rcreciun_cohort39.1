package theory;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 100;
        double fahrenheit = 212;

        // Было:
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius + " °C = " + celsiusToFahrenheit + " °F");
        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius + " °C");
    }

    // Конвертирует температуру из Цельсия в Фаренгейты
    public static void celsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " °C = " + celsiusToFahrenheit + " °F");
    }

    // Конвертирует температуру из Фаренгейтов в Цельсии
    public static void fahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius + " °C");
    }
}
